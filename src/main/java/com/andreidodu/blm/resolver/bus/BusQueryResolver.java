package com.andreidodu.blm.resolver.bus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Bus;
import com.andreidodu.blm.service.BusService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BusQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private BusService busService;

	public Bus getBus(Long id) {
		return this.busService.findById(id);
	}

	public List<Bus> getBuses() {
		return this.busService.getAll();
	}

}
