package com.andreidodu.blm.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusPathStep;
import com.andreidodu.blm.dto.input.insert.BusPathStepInsertInput;
import com.andreidodu.blm.service.BusPathStepService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class BusPathStepMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private BusPathStepService service;

	public BusPathStep insertBusPathStep(BusPathStepInsertInput data) {
		return this.service.save(data);
	}

	public BusPathStep updateBusPathStep(Long id, BusPathStepInsertInput data) {
		return this.service.update(id, data);
	}
	
	public boolean deleteBusPathStep(Long id) {
		return this.service.delete(id);
	}
}
