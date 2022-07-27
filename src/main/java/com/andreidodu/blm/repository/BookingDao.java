package com.andreidodu.blm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.andreidodu.blm.db.BookingDB;

@Repository
public interface BookingDao extends CrudRepository<BookingDB, Long> {

	List<BookingDB> getByBusPathStepEndIdEquals(Long currentPathId);

	List<BookingDB> getByBusPathStepStartIdEquals(Long currentPathId);

}
