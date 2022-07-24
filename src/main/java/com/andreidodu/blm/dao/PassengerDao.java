package com.andreidodu.blm.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.blm.db.PassengerDB;

public interface PassengerDao extends CrudRepository<PassengerDB, Long> {

}
