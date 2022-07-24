package com.andreidodu.blm.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.blm.db.BusLineDB;

public interface BusLineDao extends CrudRepository<BusLineDB, Long> {

}
