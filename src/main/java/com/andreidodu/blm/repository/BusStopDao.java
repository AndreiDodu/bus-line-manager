package com.andreidodu.blm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andreidodu.blm.db.BusStopDB;

@Repository
public interface BusStopDao extends CrudRepository<BusStopDB, Long> {

}
