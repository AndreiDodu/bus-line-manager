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
public abstract class CommonServiceImpl<DTOType, DBType, DatoType extends CrudRepository<DBType, IDType>, InsertDTOType, IDType, MapperType extends CommonMapper<DTOType, DBType, InsertDTOType>> {

	final Class<DTOType> typeOfDTO;
	final Class<DBType> typeOfDB;

	@Autowired
	private MapperType mapper;

	public CommonServiceImpl(Class<DTOType> typeOfA, Class<DBType> typeOfB) {
		this.typeOfDTO = typeOfA;
		this.typeOfDB = typeOfB;
	}

	public DTOType findById(IDType id) {
		DBType db = this.getDao().findById(id).get();
		return this.getMapper().toDTO(db);
	}

	public List<DTOType> getAll() {
		List<DTOType> buses = new ArrayList<>();
		this.getDao().findAll().forEach(busDB -> {
			buses.add(getMapper().toDTO(busDB));
		});
		return buses;
	}

	public DTOType save(InsertDTOType data) {
		DBType toSave = this.getMapper().mapIDTOToDB(data);
		DBType db = this.getDao().save(toSave);
		return this.getMapper().toDTO(db);
	}

	public DTOType update(IDType id, InsertDTOType data) {
		DBType db = this.getDao().findById(id).get();
		this.getMapper().mapUDTOToDB(db, data);
		db = this.getDao().save(db);
		return this.getMapper().toDTO(db);
	}

	public boolean delete(IDType id) {
		Optional<DBType> dbOpt = this.getDao().findById(id);
		if (dbOpt.isPresent()) {
			this.getDao().delete(dbOpt.get());
			return true;
		}
		return false;
	}

	protected abstract DatoType getDao();

	protected MapperType getMapper() {
		return this.mapper;
	}

}
