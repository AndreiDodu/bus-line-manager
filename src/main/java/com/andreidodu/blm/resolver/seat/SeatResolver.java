package com.andreidodu.blm.resolver.seat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Seat;
import com.andreidodu.blm.service.SeatService;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class SeatResolver implements GraphQLResolver<Seat> {

	@Autowired
	private SeatService seatService;

	public Seat getFieldSeatId(Long id) {
		return this.seatService.findById(id);
	}

}
