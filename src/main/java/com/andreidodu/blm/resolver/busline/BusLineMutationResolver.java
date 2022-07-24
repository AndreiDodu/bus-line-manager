package com.andreidodu.blm.resolver.busline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusLine;
import com.andreidodu.blm.dto.input.insert.BusLineInsertInput;
import com.andreidodu.blm.service.BusLineService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class BusLineMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private BusLineService busLineService;

	public BusLine insertBusLine(BusLineInsertInput data) {
		return this.busLineService.save(data);
	}

	public BusLine updateBusLine(Long id, BusLineInsertInput data) {
		return this.busLineService.update(id, data);
	}

}
