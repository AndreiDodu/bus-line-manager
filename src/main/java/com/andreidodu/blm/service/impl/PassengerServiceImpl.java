package com.andreidodu.blm.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.blm.dao.PassengerDao;
import com.andreidodu.blm.db.PassengerDB;
import com.andreidodu.blm.dto.Passenger;
import com.andreidodu.blm.dto.input.insert.PassengerInsertInput;
import com.andreidodu.blm.service.PassengerService;

@Service
@Transactional
public class PassengerServiceImpl extends CommonServiceImpl<Passenger, PassengerDB, PassengerDao, PassengerInsertInput> implements PassengerService {

	@Autowired
	private PassengerDao passengerDao;

	public PassengerServiceImpl() {
		super(Passenger.class, PassengerDB.class);
	}

	public PassengerDao getDao() {
		return this.passengerDao;
	}

}
