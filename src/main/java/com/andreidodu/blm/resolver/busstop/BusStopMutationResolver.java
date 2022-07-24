package com.andreidodu.blm.resolver.busstop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusStop;
import com.andreidodu.blm.dto.input.insert.BusStopInsertInput;
import com.andreidodu.blm.service.BusStopService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class BusStopMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private BusStopService service;

	public BusStop insertBusStop(BusStopInsertInput data) {
		return this.service.save(data);
	}

	public BusStop updateBusStop(Long id, BusStopInsertInput data) {
		return this.service.update(id, data);
	}
	
	public boolean deleteBusStop(Long id) {
		return this.service.delete(id);
	}

}
