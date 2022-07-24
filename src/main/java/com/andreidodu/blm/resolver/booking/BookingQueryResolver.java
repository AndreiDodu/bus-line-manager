package com.andreidodu.blm.resolver.booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Booking;
import com.andreidodu.blm.service.BookingService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BookingQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private BookingService bookingService;

	public Booking getBooking(Long id) {
		return this.bookingService.findById(id);
	}

	public List<Booking> getBookings() {
		return this.bookingService.getAll();
	}

}
