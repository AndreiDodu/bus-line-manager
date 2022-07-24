package com.andreidodu.buslinemanager.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.buslinemanager.db.PassengerDB;

public interface PassengerDao extends CrudRepository<PassengerDB, Long> {

}
