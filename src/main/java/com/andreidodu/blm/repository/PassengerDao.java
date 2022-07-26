package com.andreidodu.blm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andreidodu.blm.db.PassengerDB;

@Repository
public interface PassengerDao extends CrudRepository<PassengerDB, Long> {

}
