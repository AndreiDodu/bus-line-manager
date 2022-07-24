package com.andreidodu.buslinemanager.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.buslinemanager.db.BusStopDB;

public interface BusStopDao extends CrudRepository<BusStopDB, Long> {

}
