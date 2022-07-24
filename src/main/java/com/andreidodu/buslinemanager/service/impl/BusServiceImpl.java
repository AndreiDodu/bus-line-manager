package com.andreidodu.buslinemanager.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.buslinemanager.dao.BusStopDao;
import com.andreidodu.buslinemanager.db.BusStopDB;
import com.andreidodu.buslinemanager.dto.BusStop;
import com.andreidodu.buslinemanager.dto.input.BusStopInput;
import com.andreidodu.buslinemanager.service.BusStopService;

@Service
@Transactional
public class BusServiceImpl extends CommonServiceImpl<BusStop, BusStopDB, BusStopDao, BusStopInput>
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
