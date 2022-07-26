package com.andreidodu.blm.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.glasnost.orika.MapperFacade;

@Transactional(propagation = Propagation.REQUIRED)
public abstract class CommonServiceImpl<A, B, C extends CrudRepository<B, E>, D, E> {

	final Class<A> typeOfA;
	final Class<B> typeOfB;

	@Autowired
	private MapperFacade mapper;

	public CommonServiceImpl(Class<A> typeOfA, Class<B> typeOfB) {
		this.typeOfA = typeOfA;
		this.typeOfB = typeOfB;
	}

	public A findById(E id) {
		B db = this.getDao().findById(id).get();
		return this.getMapper().map(db, typeOfA);
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

	public A update(E id, D data) {
		B db = this.getDao().findById(id).get();
		this.getMapper().map(data, db);
		db = this.getDao().save(db);
		return this.getMapper().map(db, typeOfA);
	}

	public boolean delete(E id) {
		Optional<B> dbOpt = this.getDao().findById(id);
		if (dbOpt.isPresent()) {
			this.getDao().delete(dbOpt.get());
			return true;
		}
		return false;
	}

	protected abstract C getDao();

	protected MapperFacade getMapper() {
		return this.mapper;
	}

}
