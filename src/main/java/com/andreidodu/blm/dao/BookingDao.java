package com.andreidodu.blm.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.blm.db.BookingDB;

public interface BookingDao extends CrudRepository<BookingDB, Long> {

	List<BookingDB> getByBusPathEnd_IdEquals(Long currentPathId);

	List<BookingDB> getByBusPathStart_IdEquals(Long currentPathId);

}
