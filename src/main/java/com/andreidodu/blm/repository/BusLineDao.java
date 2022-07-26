package com.andreidodu.blm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andreidodu.blm.db.BusLineDB;

@Repository
public interface BusLineDao extends CrudRepository<BusLineDB, Long> {

}
