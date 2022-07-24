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
	private PassengerService service;

	public Passenger insertPassenger(PassengerInsertInput data) {
		return this.service.save(data);
	}

	public Passenger updatePassenger(Long id, PassengerInsertInput data) {
		return this.service.update(id, data);
	}

	public boolean deletePassenger(Long id) {
		return this.service.delete(id);
	}

}
