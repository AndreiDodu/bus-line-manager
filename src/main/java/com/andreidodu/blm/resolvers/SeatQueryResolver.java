package com.andreidodu.blm.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Seat;
import com.andreidodu.blm.service.SeatService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class SeatQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private SeatService service;

	public Seat getSeat(Long id) {
		return this.service.findById(id);
	}

	public List<Seat> getSeats() {
		return this.service.getAll();
	}

}
