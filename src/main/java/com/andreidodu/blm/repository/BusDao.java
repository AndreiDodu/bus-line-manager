package com.andreidodu.blm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andreidodu.blm.db.BusDB;

@Repository
public interface BusDao extends CrudRepository<BusDB, Long> {

}
