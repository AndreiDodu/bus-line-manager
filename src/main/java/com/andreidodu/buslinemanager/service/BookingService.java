package com.andreidodu.buslinemanager.service;

import com.andreidodu.buslinemanager.dto.Booking;
import com.andreidodu.buslinemanager.dto.input.BookingInput;

public interface BookingService {

	Booking findById(Long id);

	Booking save(BookingInput data);

	Booking update(Long id, BookingInput data);

}
