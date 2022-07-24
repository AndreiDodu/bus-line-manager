package com.andreidodu.blm.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.blm.dao.BookingDao;
import com.andreidodu.blm.dao.BusStopDao;
import com.andreidodu.blm.db.BookingDB;
import com.andreidodu.blm.db.BusStopDB;
import com.andreidodu.blm.dto.BusStop;
import com.andreidodu.blm.dto.BusStopInfo;
import com.andreidodu.blm.dto.Passenger;
import com.andreidodu.blm.dto.input.insert.BusStopInsertInput;
import com.andreidodu.blm.service.BusStopService;

@Service
@Transactional
public class BusStopServiceImpl extends CommonServiceImpl<BusStop, BusStopDB, BusStopDao, BusStopInsertInput>
		implements BusStopService {

	@Autowired
	private BusStopDao busStopDao;

	@Autowired
	private BookingDao bookingDao;

	public BusStopServiceImpl() {
		super(BusStop.class, BusStopDB.class);
	}

	public BusStopDao getDao() {
		return this.busStopDao;
	}

	public BusStopInfo getGetOffPassengers(Long currentBusStopPathId) {
		BusStopInfo result = new BusStopInfo();
		List<BookingDB> allPassangersThatHaveToGetOff = this.bookingDao.getByBusPathEnd_IdEquals(currentBusStopPathId);
		List<Passenger> passengers = allPassangersThatHaveToGetOff.stream().map(booking -> {
			return this.getMapper().map(booking.getPassenger(), Passenger.class);
		}).collect(Collectors.toList());
		result.setPassengers(passengers);
		result.setPassengersCount(passengers.size());
		return result;
	}

	public BusStopInfo getGetOnPassengers(Long currentBusStopPathId) {
		BusStopInfo result = new BusStopInfo();
		List<BookingDB> allPassangersThatHaveToGetOn = this.bookingDao.getByBusPathStart_IdEquals(currentBusStopPathId);
		List<Passenger> passengers = allPassangersThatHaveToGetOn.stream().map(booking -> {
			return this.getMapper().map(booking.getPassenger(), Passenger.class);
		}).collect(Collectors.toList());
		result.setPassengers(passengers);
		result.setPassengersCount(passengers.size());
		return result;
	}
}
