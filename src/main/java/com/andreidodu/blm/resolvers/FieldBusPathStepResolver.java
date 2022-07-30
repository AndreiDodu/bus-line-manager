package com.andreidodu.blm.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusPath;
import com.andreidodu.blm.dto.BusPathStep;
import com.andreidodu.blm.dto.BusStop;
import com.andreidodu.blm.service.BusPathService;
import com.andreidodu.blm.service.BusStopService;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class FieldBusPathStepResolver implements GraphQLResolver<BusPathStep> {

	@Autowired
	private BusStopService busStopService;

	@Autowired
	private BusPathService busPathService;

	public BusStop getBusStop(BusPathStep busPathStop) {
		return this.busStopService.findById(busPathStop.busStopId());
	}

	public BusPath getBusPath(BusPathStep busPathStep) {
		return this.busPathService.findById(busPathStep.busPathId());
	}
}
