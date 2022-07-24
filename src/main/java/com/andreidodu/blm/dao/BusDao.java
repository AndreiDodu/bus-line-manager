package com.andreidodu.blm.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.blm.db.BusDB;

public interface BusDao extends CrudRepository<BusDB, Long> {

}
