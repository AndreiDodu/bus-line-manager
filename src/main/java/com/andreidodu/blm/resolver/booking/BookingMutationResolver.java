package com.andreidodu.blm.resolver.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Booking;
import com.andreidodu.blm.dto.input.insert.BookingInsertInput;
import com.andreidodu.blm.service.BookingService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class BookingMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private BookingService bookingService;

	public Booking insertBooking(BookingInsertInput data) {
		return this.bookingService.save(data);
	}

	public Booking updateBooking(Long id, BookingInsertInput data) {
		return this.bookingService.update(id, data);
	}

}
