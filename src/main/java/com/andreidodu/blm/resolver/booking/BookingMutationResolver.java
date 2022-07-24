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
	private BookingService service;

	public Booking insertBooking(BookingInsertInput data) {
		return this.service.save(data);
	}

	public Booking updateBooking(Long id, BookingInsertInput data) {
		return this.service.update(id, data);
	}

	public boolean deleteBooking(Long id) {
		return this.service.delete(id);
	}

}
