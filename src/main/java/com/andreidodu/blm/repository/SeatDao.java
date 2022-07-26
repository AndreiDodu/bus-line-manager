package com.andreidodu.blm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andreidodu.blm.db.SeatDB;

@Repository
public interface SeatDao extends CrudRepository<SeatDB, Long> {

}
