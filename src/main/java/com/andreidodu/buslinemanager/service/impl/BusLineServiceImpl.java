package com.andreidodu.buslinemanager.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.buslinemanager.dao.BusLineDao;
import com.andreidodu.buslinemanager.db.BusLineDB;
import com.andreidodu.buslinemanager.dto.BusLine;
import com.andreidodu.buslinemanager.dto.input.BusLineInput;
import com.andreidodu.buslinemanager.service.BusLineService;

@Service
@Transactional
public class BusLineServiceImpl extends CommonServiceImpl<BusLine, BusLineDB, BusLineDao, BusLineInput>
		implements BusLineService {

	@Autowired
	private BusLineDao busLineDao;

	public BusLineServiceImpl() {
		super(BusLine.class, BusLineDB.class);
	}

	public BusLineDao getDao() {
		return this.busLineDao;
	}

}
