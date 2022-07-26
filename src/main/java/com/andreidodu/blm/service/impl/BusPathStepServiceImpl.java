package com.andreidodu.blm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.andreidodu.blm.db.BusPathDB;
import com.andreidodu.blm.db.BusPathStepDB;
import com.andreidodu.blm.db.BusStopDB;
import com.andreidodu.blm.dto.BusPathStep;
import com.andreidodu.blm.dto.input.insert.BusPathStepInsertInput;
import com.andreidodu.blm.repository.BusPathStepDao;
import com.andreidodu.blm.service.BusPathStepService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BusPathStepServiceImpl
		extends CommonServiceImpl<BusPathStep, BusPathStepDB, BusPathStepDao, BusPathStepInsertInput, Long>
		implements BusPathStepService {

	@Autowired
	private BusPathStepDao busPathDao;

	public BusPathStepServiceImpl() {
		super(BusPathStep.class, BusPathStepDB.class);
	}

	public BusPathStepDao getDao() {
		return this.busPathDao;
	}

	@Override
	public BusPathStep save(BusPathStepInsertInput data) {

		BusStopDB busStopDB = new BusStopDB();
		busStopDB.setId(data.getBusStopId());
		BusPathDB busPathDB = new BusPathDB();
		busPathDB.setId(data.getBusPathId());

		BusPathStepDB busPathStepDB = new BusPathStepDB();
		busPathStepDB.setBusPath(busPathDB);
		busPathStepDB.setBusStop(busStopDB);

		this.getMapper().map(data, busPathStepDB);

		return this.getMapper().map(this.busPathDao.save(busPathStepDB), BusPathStep.class);
	}

	@Override
	public List<BusPathStep> findByBusPathId(Long busPathId) {
		Iterable<BusPathStepDB> dbs = this.busPathDao.findByBusPath_Id(busPathId);
		return this.getMapper().mapAsList(dbs, BusPathStep.class);
	}

}
