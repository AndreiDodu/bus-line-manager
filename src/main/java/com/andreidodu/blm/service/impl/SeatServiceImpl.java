package com.andreidodu.blm.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.blm.dao.SeatDao;
import com.andreidodu.blm.db.SeatDB;
import com.andreidodu.blm.dto.Seat;
import com.andreidodu.blm.dto.input.insert.SeatInsertInput;
import com.andreidodu.blm.service.SeatService;

@Service
@Transactional
public class SeatServiceImpl extends CommonServiceImpl<Seat, SeatDB, SeatDao, SeatInsertInput, Long> implements SeatService {

	@Autowired
	private SeatDao seatDao;

	public SeatServiceImpl() {
		super(Seat.class, SeatDB.class);
	}

	public SeatDao getDao() {
		return this.seatDao;
	}

}
