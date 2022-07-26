package com.andreidodu.blm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andreidodu.blm.db.BusPathDB;

@Repository
public interface BusPathDao extends CrudRepository<BusPathDB, Long> {

}
