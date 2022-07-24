package com.andreidodu.buslinemanager.resolver.busstop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.buslinemanager.dto.BusStop;
import com.andreidodu.buslinemanager.dto.input.insert.BusStopInsertInput;
import com.andreidodu.buslinemanager.service.BusStopService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class BusStopMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private BusStopService busStopService;

	public BusStop insertBusStop(BusStopInsertInput data) {
		return this.busStopService.save(data);
	}

	public BusStop updateBusStop(Long id, BusStopInsertInput data) {
		return this.busStopService.update(id, data);
	}

}
