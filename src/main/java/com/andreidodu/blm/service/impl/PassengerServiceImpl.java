package com.andreidodu.blm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.andreidodu.blm.db.PassengerDB;
import com.andreidodu.blm.dto.Passenger;
import com.andreidodu.blm.dto.input.insert.PassengerInsertInput;
import com.andreidodu.blm.mapper.PassengerMapper;
import com.andreidodu.blm.repository.PassengerDao;
import com.andreidodu.blm.service.PassengerService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class PassengerServiceImpl
		extends CommonServiceImpl<Passenger, PassengerDB, PassengerDao, PassengerInsertInput, Long, PassengerMapper>
		implements PassengerService {

	@Autowired
	private PassengerDao passengerDao;

	public PassengerServiceImpl() {
		super(Passenger.class, PassengerDB.class);
	}

	public PassengerDao getDao() {
		return this.passengerDao;
	}

}
