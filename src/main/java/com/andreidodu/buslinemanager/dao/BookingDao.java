package com.andreidodu.buslinemanager.dao;

import org.springframework.data.repository.CrudRepository;

import com.andreidodu.buslinemanager.db.BookingDB;

public interface BookingDao extends CrudRepository<BookingDB, Long> {

}
