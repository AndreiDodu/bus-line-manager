package com.andreidodu.blm.resolver.passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Passenger;
import com.andreidodu.blm.dto.input.insert.PassengerInsertInput;
import com.andreidodu.blm.service.PassengerService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class PassengerMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private PassengerService passengerservice;

	public Passenger insertPassenger(PassengerInsertInput data) {
		return this.passengerservice.save(data);
	}

	public Passenger updatePassenger(Long id, PassengerInsertInput data) {
		return this.passengerservice.update(id, data);
	}

}
