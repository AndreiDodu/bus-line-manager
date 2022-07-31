package com.andreidodu.blm.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Passenger;
import com.andreidodu.blm.dto.input.insert.PassengerInsertInput;
import com.andreidodu.blm.service.PassengerService;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;

@Component
public class PassengerMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private PassengerService service;

	public Passenger insertPassenger(PassengerInsertInput data, DataFetchingEnvironment env) {
		return this.service.save(data, env);
	}

	public Passenger updatePassenger(Long id, PassengerInsertInput data) {
		return this.service.update(id, data);
	}

	public boolean deletePassenger(Long id) {
		return this.service.delete(id);
	}

}
