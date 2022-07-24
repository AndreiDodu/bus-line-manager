package com.andreidodu.blm.resolver.passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Passenger;
import com.andreidodu.blm.dto.Seat;
import com.andreidodu.blm.service.PassengerService;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class PassengerResolver implements GraphQLResolver<Seat> {

	@Autowired
	private PassengerService passengerService;

	public Passenger getFieldPassengerId(Long id) {
		return this.passengerService.findById(id);
	}

}
