package com.andreidodu.buslinemanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.buslinemanager.dao.BusDao;
import com.andreidodu.buslinemanager.db.BusDB;
import com.andreidodu.buslinemanager.dto.Bus;
import com.andreidodu.buslinemanager.dto.input.BusInput;
import com.andreidodu.buslinemanager.service.BusService;

@Service
@Transactional
public class BusServiceImpl implements BusService {

	@Autowired
	private BusDao busDao;

	@Autowired
	private Mapper mapper;

	@Override
	public Bus findById(Long id) {
		BusDB db = this.busDao.findById(id).get();
		return (new DozerBeanMapper()).map(db, Bus.class);
	}

	@Override
	public List<Bus> getAll() {
		DozerBeanMapper mapper = new DozerBeanMapper();
		List<Bus> buses = new ArrayList<>();
		this.busDao.findAll().forEach(busDB -> {
			buses.add(mapper.map(busDB, Bus.class));
		});
		return buses;
	}

	@Override
	public Bus save(BusInput data) {
		BusDB db = this.busDao.save(this.mapper.map(data, BusDB.class));
		return this.mapper.map(db, Bus.class);
	}

	@Override
	public Bus update(Long id, BusInput data) {
		BusDB db = this.busDao.findById(id).get();
		this.mapper.map(data, db);
		db = this.busDao.save(db);
		return this.mapper.map(db, Bus.class);
	}

}
