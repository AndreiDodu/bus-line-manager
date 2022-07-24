package com.andreidodu.blm.resolver.busstop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusStop;
import com.andreidodu.blm.service.BusStopService;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class BusStopResolver implements GraphQLResolver<BusStop> {

	@Autowired
	private BusStopService busStopService;

	public BusStop getFieldBusStopEndId(Long id) {
		return this.busStopService.findById(id);
	}

	public BusStop getFieldBusStopStartId(Long id) {
		return this.busStopService.findById(id);
	}
	
	public BusStop getFieldBusStop(Long id) {
		return this.busStopService.findById(id);
	}

}
