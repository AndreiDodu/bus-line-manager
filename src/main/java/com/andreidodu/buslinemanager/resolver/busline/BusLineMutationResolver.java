package com.andreidodu.buslinemanager.resolver.busline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.buslinemanager.dto.BusLine;
import com.andreidodu.buslinemanager.dto.input.BusLineInput;
import com.andreidodu.buslinemanager.service.BusLineService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class BusLineMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private BusLineService busLineService;

	public BusLine insertBusLine(BusLineInput data) {
		return this.busLineService.save(data);
	}

	public BusLine updateBusLine(Long id, BusLineInput data) {
		return this.busLineService.update(id, data);
	}

}
