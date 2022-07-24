package com.andreidodu.buslinemanager.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.buslinemanager.dto.Bus;
import com.andreidodu.buslinemanager.dto.input.BusInput;
import com.andreidodu.buslinemanager.service.BusService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class BusMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private BusService busService;

	public Bus insertBus(BusInput data) {
		return this.busService.save(data);
	}

	public Bus updateBus(Long id, BusInput data) {
		return this.busService.update(id, data);
	}

}
