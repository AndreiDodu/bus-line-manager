package com.andreidodu.blm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.andreidodu.blm.db.BusDB;
import com.andreidodu.blm.dto.Bus;
import com.andreidodu.blm.dto.input.insert.BusInsertInput;
import com.andreidodu.blm.repository.BusDao;
import com.andreidodu.blm.service.BusService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BusServiceImpl extends CommonServiceImpl<Bus, BusDB, BusDao, BusInsertInput, Long> implements BusService {

	@Autowired
	private BusDao busDao;

	public BusServiceImpl() {
		super(Bus.class, BusDB.class);
	}

	public BusDao getDao() {
		return this.busDao;
	}

}
