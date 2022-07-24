package com.andreidodu.buslinemanager.service.impl;

import javax.transaction.Transactional;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.buslinemanager.dao.BusDao;
import com.andreidodu.buslinemanager.db.BusDB;
import com.andreidodu.buslinemanager.dto.Bus;
import com.andreidodu.buslinemanager.service.BusService;

@Service
@Transactional
public class BusServiceImpl implements BusService {

	@Autowired
	private BusDao busDao;

	@Override
	public Bus findById(Long id) {
		BusDB db = this.busDao.findById(id).get();
		return (new DozerBeanMapper()).map(db, Bus.class);
	}

}
