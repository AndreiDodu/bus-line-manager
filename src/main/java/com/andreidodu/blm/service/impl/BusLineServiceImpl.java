package com.andreidodu.blm.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.blm.dao.BusLineDao;
import com.andreidodu.blm.db.BusLineDB;
import com.andreidodu.blm.dto.BusLine;
import com.andreidodu.blm.dto.input.insert.BusLineInsertInput;
import com.andreidodu.blm.service.BusLineService;

@Service
@Transactional
public class BusLineServiceImpl extends CommonServiceImpl<BusLine, BusLineDB, BusLineDao, BusLineInsertInput>
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
