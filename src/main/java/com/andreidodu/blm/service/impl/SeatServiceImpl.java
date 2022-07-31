package com.andreidodu.blm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.andreidodu.blm.db.SeatDB;
import com.andreidodu.blm.dto.Seat;
import com.andreidodu.blm.dto.input.insert.SeatInsertInput;
import com.andreidodu.blm.mapper.SeatMapper;
import com.andreidodu.blm.repository.SeatDao;
import com.andreidodu.blm.service.SeatService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class SeatServiceImpl extends CommonServiceImpl<Seat, SeatDB, SeatDao, SeatInsertInput, Long, SeatMapper>
		implements SeatService {

	@Autowired
	private SeatDao seatDao;

	public SeatServiceImpl() {
		super(Seat.class, SeatDB.class);
	}

	public SeatDao getDao() {
		return this.seatDao;
	}

}
