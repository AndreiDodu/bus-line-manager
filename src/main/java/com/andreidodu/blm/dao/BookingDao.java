package com.andreidodu.blm.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.blm.db.BookingDB;

public interface BookingDao extends CrudRepository<BookingDB, Long> {

}
