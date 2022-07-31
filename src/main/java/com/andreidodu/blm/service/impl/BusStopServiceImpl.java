package com.andreidodu.blm.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.andreidodu.blm.db.BookingDB;
import com.andreidodu.blm.db.BusStopDB;
import com.andreidodu.blm.dto.BusStop;
import com.andreidodu.blm.dto.BusStopInfo;
import com.andreidodu.blm.dto.Passenger;
import com.andreidodu.blm.dto.input.insert.BusStopInsertInput;
import com.andreidodu.blm.mapper.BusStopMapper;
import com.andreidodu.blm.mapper.PassengerMapper;
import com.andreidodu.blm.repository.BookingDao;
import com.andreidodu.blm.repository.BusStopDao;
import com.andreidodu.blm.service.BusStopService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BusStopServiceImpl
		extends CommonServiceImpl<BusStop, BusStopDB, BusStopDao, BusStopInsertInput, Long, BusStopMapper>
		implements BusStopService {

	@Autowired
	private BusStopDao busStopDao;

	@Autowired
	private BookingDao bookingDao;

	@Autowired
	private PassengerMapper passengerMapper;

	public BusStopServiceImpl() {
		super(BusStop.class, BusStopDB.class);
	}

	public BusStopDao getDao() {
		return this.busStopDao;
	}

	public BusStopInfo getGetOffPassengers(Long currentBusStopPathId) {
		List<BookingDB> allPassangersThatHaveToGetOff = this.bookingDao
				.getByBusPathStepEndIdEquals(currentBusStopPathId);
		List<Passenger> passengers = allPassangersThatHaveToGetOff.stream().map(booking -> {
			return this.passengerMapper.toDTO(booking.getPassenger());
		}).collect(Collectors.toList());

		BusStopInfo result = new BusStopInfo(passengers.size(), passengers);
		return result;
	}

	public BusStopInfo getGetOnPassengers(Long currentBusStopPathId) {
		List<BookingDB> allPassangersThatHaveToGetOn = this.bookingDao
				.getByBusPathStepStartIdEquals(currentBusStopPathId);
		List<Passenger> passengers = allPassangersThatHaveToGetOn.stream().map(booking -> {
			return this.passengerMapper.toDTO(booking.getPassenger());
		}).collect(Collectors.toList());
		BusStopInfo result = new BusStopInfo(passengers.size(), passengers);
		return result;
	}
}
