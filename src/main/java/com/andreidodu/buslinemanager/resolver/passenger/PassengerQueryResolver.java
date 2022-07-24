package com.andreidodu.buslinemanager.resolver.passenger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.buslinemanager.dto.Passenger;
import com.andreidodu.buslinemanager.service.PassengerService;

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
