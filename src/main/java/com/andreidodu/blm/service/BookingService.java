package com.andreidodu.blm.service;

import com.andreidodu.blm.dto.Booking;
import com.andreidodu.blm.dto.input.insert.BookingInsertInput;

public interface BookingService {

	Booking findById(Long id);

	Booking save(BookingInsertInput data);

	Booking update(Long id, BookingInsertInput data);

}
