package com.andreidodu.blm.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.andreidodu.blm.mapper.CommonMapper;

@Transactional(propagation = Propagation.REQUIRED)
public abstract class CommonServiceImpl<DTOType, DBType, C extends CrudRepository<DBType, E>, InsertDTOType, E> {

	final Class<DTOType> typeOfDTO;
	final Class<DBType> typeOfDB;

	@Autowired
	private CommonMapper<DTOType, DBType, InsertDTOType> mapper;

	public CommonServiceImpl(Class<DTOType> typeOfA, Class<DBType> typeOfB) {
		this.typeOfDTO = typeOfA;
		this.typeOfDB = typeOfB;
	}

	public DTOType findById(E id) {
		DBType db = this.getDao().findById(id).get();
		return this.getMapper().toDTO(db);
	}

	public List<DTOType> getAll() {
		List<DTOType> buses = new ArrayList<>();
		this.getDao().findAll().forEach(busDB -> {
			buses.add(getMapper().mapToDTO(busDB));
		});
		return buses;
	}

	public DTOType save(InsertDTOType data) {
		DBType toSave = this.getMapper().mapIDTOToDB(data);
		DBType db = this.getDao().save(toSave);
		return this.getMapper().mapToDTO(db);
	}

	public DTOType update(E id, InsertDTOType data) {
		DBType db = this.getDao().findById(id).get();
		this.getMapper().mapUDTOToDB(db, data);
		db = this.getDao().save(db);
		return this.getMapper().mapToDTO(db);
	}

	public boolean delete(E id) {
		Optional<DBType> dbOpt = this.getDao().findById(id);
		if (dbOpt.isPresent()) {
			this.getDao().delete(dbOpt.get());
			return true;
		}
		return false;
	}

	protected abstract C getDao();

	protected CommonMapper<DTOType, DBType, InsertDTOType> getMapper() {
		return this.mapper;
	}

}
