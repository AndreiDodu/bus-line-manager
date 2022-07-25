package com.andreidodu.blm.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusPathStep;
import com.andreidodu.blm.service.BusPathStepService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BusPathStepQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private BusPathStepService service;

	public BusPathStep getBusPathStep(Long id) {
		return this.service.findById(id);
	}

	public List<BusPathStep> getBusPathSteps() {
		return this.service.getAll();
	}

}
