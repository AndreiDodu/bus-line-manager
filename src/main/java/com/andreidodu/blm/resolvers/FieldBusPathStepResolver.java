package com.andreidodu.blm.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusPathStep;
import com.andreidodu.blm.dto.BusStop;
import com.andreidodu.blm.service.BusStopService;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class FieldBusPathStepResolver implements GraphQLResolver<BusPathStep> {

	@Autowired
	private BusStopService busStopService;

	public BusStop getBusStop(BusPathStep busPathStop) {
		return this.busStopService.findById(busPathStop.getBusStopId());
	}
}
