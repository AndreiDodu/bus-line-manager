package com.andreidodu.blm.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.blm.db.BookingDB;

public interface BookingDao extends CrudRepository<BookingDB, Long> {

	List<BookingDB> getByBusPathStepEnd_IdEquals(Long currentPathId);

	List<BookingDB> getByBusPathStepStart_IdEquals(Long currentPathId);

}
