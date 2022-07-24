package com.andreidodu.buslinemanager.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.buslinemanager.dao.PassengerDao;
import com.andreidodu.buslinemanager.db.PassengerDB;
import com.andreidodu.buslinemanager.dto.Passenger;
import com.andreidodu.buslinemanager.dto.input.PassengerInput;
import com.andreidodu.buslinemanager.service.PassengerService;

@Service
@Transactional
public class SeatServiceImpl extends CommonServiceImpl<Passenger, PassengerDB, PassengerDao, PassengerInput> implements PassengerService {

	@Autowired
	private PassengerDao passengerDao;

	public SeatServiceImpl() {
		super(Passenger.class, PassengerDB.class);
	}

	public PassengerDao getDao() {
		return this.passengerDao;
	}

}
