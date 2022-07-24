package com.andreidodu.buslinemanager.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.buslinemanager.db.BusPathDB;

public interface BusPathDao extends CrudRepository<BusPathDB, Long> {

}
