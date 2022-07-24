package com.andreidodu.blm.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.blm.dao.BusDao;
import com.andreidodu.blm.db.BusDB;
import com.andreidodu.blm.dto.Bus;
import com.andreidodu.blm.dto.input.insert.BusInsertInput;
import com.andreidodu.blm.service.BusService;

@Service
@Transactional
public class BusServiceImpl extends CommonServiceImpl<Bus, BusDB, BusDao, BusInsertInput> implements BusService {

	@Autowired
	private BusDao busDao;

	public BusServiceImpl() {
		super(Bus.class, BusDB.class);
	}

	public BusDao getDao() {
		return this.busDao;
	}

}
