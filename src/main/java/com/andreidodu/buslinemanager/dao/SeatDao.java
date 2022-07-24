package com.andreidodu.buslinemanager.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.buslinemanager.db.SeatDB;

public interface SeatDao extends CrudRepository<SeatDB, Long> {

}
