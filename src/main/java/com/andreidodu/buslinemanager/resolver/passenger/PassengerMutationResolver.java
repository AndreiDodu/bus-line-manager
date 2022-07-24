package com.andreidodu.buslinemanager.resolver.passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.buslinemanager.dto.Passenger;
import com.andreidodu.buslinemanager.dto.input.insert.PassengerInsertInput;
import com.andreidodu.buslinemanager.service.PassengerService;

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
