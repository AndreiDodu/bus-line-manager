package com.andreidodu.buslinemanager.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.buslinemanager.dao.SeatDao;
import com.andreidodu.buslinemanager.db.SeatDB;
import com.andreidodu.buslinemanager.dto.Seat;
import com.andreidodu.buslinemanager.dto.input.insert.SeatInsertInput;
import com.andreidodu.buslinemanager.service.SeatService;

@Service
@Transactional
public class PassengerServiceImpl extends CommonServiceImpl<Seat, SeatDB, SeatDao, SeatInsertInput> implements SeatService {

	@Autowired
	private SeatDao seatDao;

	public PassengerServiceImpl() {
		super(Seat.class, SeatDB.class);
	}

	public SeatDao getDao() {
		return this.seatDao;
	}

}
