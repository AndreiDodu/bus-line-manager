package com.andreidodu.buslinemanager.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.buslinemanager.db.BusDB;

public interface BusDao extends CrudRepository<BusDB, Long> {

}
