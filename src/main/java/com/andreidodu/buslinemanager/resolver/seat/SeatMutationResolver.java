package com.andreidodu.buslinemanager.resolver.seat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.buslinemanager.dto.Seat;
import com.andreidodu.buslinemanager.dto.input.insert.SeatInsertInput;
import com.andreidodu.buslinemanager.service.SeatService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class SeatMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private SeatService seatService;

	public Seat insertSeat(SeatInsertInput data) {
		return this.seatService.save(data);
	}

	public Seat updateSeat(Long id, SeatInsertInput data) {
		return this.seatService.update(id, data);
	}

}
