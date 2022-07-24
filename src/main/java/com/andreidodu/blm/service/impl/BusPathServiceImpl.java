package com.andreidodu.blm.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.blm.dao.BusLineDao;
import com.andreidodu.blm.dao.BusPathDao;
import com.andreidodu.blm.dao.BusStopDao;
import com.andreidodu.blm.db.BusLineDB;
import com.andreidodu.blm.db.BusPathDB;
import com.andreidodu.blm.db.BusStopDB;
import com.andreidodu.blm.db.PassengerDB;
import com.andreidodu.blm.db.SeatDB;
import com.andreidodu.blm.dto.BusPath;
import com.andreidodu.blm.dto.input.insert.BusPathInsertInput;
import com.andreidodu.blm.service.BusPathService;

@Service
@Transactional
public class BusPathServiceImpl extends CommonServiceImpl<BusPath, BusPathDB, BusPathDao, BusPathInsertInput>
		implements BusPathService {

	@Autowired
	private BusPathDao busPathDao;

	public BusPathServiceImpl() {
		super(BusPath.class, BusPathDB.class);
	}

	@Override
	public BusPath save(BusPathInsertInput data) {

		BusStopDB busStopDB = new BusStopDB(); 
		busStopDB.setId(data.getBusStopId());
		BusLineDB busLineDB = new BusLineDB();
		busLineDB.setId(data.getBusLineId());
		
		BusPathDB busPathDB = new BusPathDB();
		busPathDB.setBusLine(busLineDB);
		busPathDB.setBusStop(busStopDB);

		this.getMapper().map(data, busPathDB);
		
		return this.getMapper().map(this.busPathDao.save(busPathDB), BusPath.class);
	}

	public BusPathDao getDao() {
		return this.busPathDao;
	}

}
