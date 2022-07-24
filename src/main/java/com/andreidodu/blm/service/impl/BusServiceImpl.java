package com.andreidodu.blm.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.blm.dao.BusStopDao;
import com.andreidodu.blm.db.BusStopDB;
import com.andreidodu.blm.dto.BusStop;
import com.andreidodu.blm.dto.input.insert.BusStopInsertInput;
import com.andreidodu.blm.service.BusStopService;

@Service
@Transactional
public class BusServiceImpl extends CommonServiceImpl<BusStop, BusStopDB, BusStopDao, BusStopInsertInput>
		implements BusStopService {

	@Autowired
	private BusStopDao busStopDao;

	public BusServiceImpl() {
		super(BusStop.class, BusStopDB.class);
	}

	public BusStopDao getDao() {
		return this.busStopDao;
	}

}
