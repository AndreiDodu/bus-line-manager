package com.andreidodu.blm.resolver.passenger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Passenger;
import com.andreidodu.blm.service.PassengerService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class PassengerQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private PassengerService passengerService;

	public Passenger getPassenger(Long id) {
		return this.passengerService.findById(id);
	}

	public List<Passenger> getPassengers() {
		return this.passengerService.getAll();
	}

}
