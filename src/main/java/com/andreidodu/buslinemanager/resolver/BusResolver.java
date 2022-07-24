package com.andreidodu.buslinemanager.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.buslinemanager.dto.Bus;
import com.andreidodu.buslinemanager.service.BusService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BusResolver implements GraphQLQueryResolver {

	@Autowired
	private BusService busService;

	public Bus getBus(Long id) {
		return this.busService.findById(id);
	}

}
