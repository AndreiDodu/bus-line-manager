package com.andreidodu.buslinemanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public abstract class CommonServiceImpl<A, B, C extends CrudRepository<B, Long>, D> {

	final Class<A> typeOfA;
	final Class<B> typeOfB;

	@Autowired
	private Mapper mapper;

	public CommonServiceImpl(Class<A> typeOfA, Class<B> typeOfB) {
		this.typeOfA = typeOfA;
		this.typeOfB = typeOfB;
	}

	public A findById(Long id) {
		B db = this.getDao().findById(id).get();
		return (new DozerBeanMapper()).map(db, typeOfA);
	}

	public List<A> getAll() {
		List<A> buses = new ArrayList<>();
		this.getDao().findAll().forEach(busDB -> {
			buses.add(getMapper().map(busDB, typeOfA));
		});
		return buses;
	}

	public A save(D data) {
		B db = this.getDao().save(this.getMapper().map(data, this.typeOfB));
		return this.getMapper().map(db, typeOfA);
	}

	public A update(Long id, D data) {
		B db = this.getDao().findById(id).get();
		this.getMapper().map(data, db);
		db = this.getDao().save(db);
		return this.getMapper().map(db, typeOfA);
	}

	public abstract C getDao();

	public Mapper getMapper() {
		return this.mapper;
	}

}
