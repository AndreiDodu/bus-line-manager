package com.andreidodu.buslinemanager.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.buslinemanager.dao.BusDao;
import com.andreidodu.buslinemanager.db.BusDB;
import com.andreidodu.buslinemanager.dto.Bus;
import com.andreidodu.buslinemanager.dto.input.BusInput;
import com.andreidodu.buslinemanager.service.BusService;

@Service
@Transactional
public class BusStopServiceImpl extends CommonServiceImpl<Bus, BusDB, BusDao, BusInput> implements BusService {

	@Autowired
	private BusDao busDao;

	public BusStopServiceImpl() {
		super(Bus.class, BusDB.class);
	}

	public BusDao getDao() {
		return this.busDao;
	}

}
