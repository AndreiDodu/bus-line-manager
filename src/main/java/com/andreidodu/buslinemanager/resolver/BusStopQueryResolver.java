package com.andreidodu.buslinemanager.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.buslinemanager.dto.BusStop;
import com.andreidodu.buslinemanager.service.BusStopService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BusStopQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private BusStopService busStopService;

	public BusStop getBusStop(Long id) {
		return this.busStopService.findById(id);
	}

	public List<BusStop> getBusStops() {
		return this.busStopService.getAll();
	}

}
