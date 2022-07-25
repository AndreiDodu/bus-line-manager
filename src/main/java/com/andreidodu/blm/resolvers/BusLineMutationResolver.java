package com.andreidodu.blm.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusLine;
import com.andreidodu.blm.dto.input.insert.BusLineInsertInput;
import com.andreidodu.blm.service.BusLineService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class BusLineMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private BusLineService service;

	public BusLine insertBusLine(BusLineInsertInput data) {
		return this.service.save(data);
	}

	public BusLine updateBusLine(Long id, BusLineInsertInput data) {
		return this.service.update(id, data);
	}
	
	public boolean deleteBusLine(Long id) {
		return this.service.delete(id);
	}

}
