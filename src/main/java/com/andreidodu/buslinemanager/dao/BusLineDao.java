package com.andreidodu.buslinemanager.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.buslinemanager.db.BusLineDB;

public interface BusLineDao extends CrudRepository<BusLineDB, Long> {

}
