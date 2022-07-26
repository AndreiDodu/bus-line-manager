package com.andreidodu.blm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.andreidodu.blm.db.BusLineDB;
import com.andreidodu.blm.dto.BusLine;
import com.andreidodu.blm.dto.input.insert.BusLineInsertInput;
import com.andreidodu.blm.repository.BusLineDao;
import com.andreidodu.blm.service.BusLineService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BusLineServiceImpl extends CommonServiceImpl<BusLine, BusLineDB, BusLineDao, BusLineInsertInput, Long>
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
