package com.andreidodu.blm.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.blm.db.BusStopDB;

public interface BusStopDao extends CrudRepository<BusStopDB, Long> {

}
