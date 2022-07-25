package com.andreidodu.blm.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusStop;
import com.andreidodu.blm.dto.BusStopInfo;
import com.andreidodu.blm.service.BusStopService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BusStopQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private BusStopService service;

	public BusStop getBusStop(Long id) {
		return this.service.findById(id);
	}

	public List<BusStop> getBusStops() {
		return this.service.getAll();
	}

	public BusStopInfo getGetOffPassengers(Long currentBusPathId) {
		return this.service.getGetOffPassengers(currentBusPathId);
	}

	public BusStopInfo getGetOnPassengers(Long currentBusPathId) {
		return this.service.getGetOnPassengers(currentBusPathId);
	}
}
