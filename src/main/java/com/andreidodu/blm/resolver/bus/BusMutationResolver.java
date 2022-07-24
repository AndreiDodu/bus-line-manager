package com.andreidodu.blm.resolver.bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Bus;
import com.andreidodu.blm.dto.input.insert.BusInsertInput;
import com.andreidodu.blm.service.BusService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class BusMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private BusService busService;

	public Bus insertBus(BusInsertInput data) {
		return this.busService.save(data);
	}

	public Bus updateBus(Long id, BusInsertInput data) {
		return this.busService.update(id, data);
	}

}
