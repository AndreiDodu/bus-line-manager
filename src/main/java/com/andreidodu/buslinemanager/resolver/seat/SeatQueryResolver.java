package com.andreidodu.buslinemanager.resolver.seat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.buslinemanager.dto.Seat;
import com.andreidodu.buslinemanager.service.SeatService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class SeatQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private SeatService seatService;

	public Seat getSeat(Long id) {
		return this.seatService.findById(id);
	}

	public List<Seat> getSeats() {
		return this.seatService.getAll();
	}

}
