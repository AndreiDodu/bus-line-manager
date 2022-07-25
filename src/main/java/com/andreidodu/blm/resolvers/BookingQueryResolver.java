package com.andreidodu.blm.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Booking;
import com.andreidodu.blm.service.BookingService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BookingQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private BookingService service;

	public Booking getBooking(Long id) {
		return this.service.findById(id);
	}

	public List<Booking> getBookings() {
		return this.service.getAll();
	}

}
