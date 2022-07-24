package com.andreidodu.blm.resolver.buspath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusPath;
import com.andreidodu.blm.service.BusPathService;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class BusPathResolver implements GraphQLResolver<BusPath> {

	@Autowired
	private BusPathService passengerService;

	public BusPath getFieldBusPathEndId(Long id) {
		return this.passengerService.findById(id);
	}

	public BusPath getFieldBusPathStartId(Long id) {
		return this.passengerService.findById(id);
	}

}
