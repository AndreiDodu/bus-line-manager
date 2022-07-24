package com.andreidodu.buslinemanager.service;

import com.andreidodu.buslinemanager.dto.Booking;
import com.andreidodu.buslinemanager.dto.input.insert.BookingInsertInput;

public interface BookingService {

	Booking findById(Long id);

	Booking save(BookingInsertInput data);

	Booking update(Long id, BookingInsertInput data);

}
