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
	private BusStopService busStopService;

	public BusStop insertBusStop(BusStopInsertInput data) {
		return this.busStopService.save(data);
	}

	public BusStop updateBusStop(Long id, BusStopInsertInput data) {
		return this.busStopService.update(id, data);
	}

}
