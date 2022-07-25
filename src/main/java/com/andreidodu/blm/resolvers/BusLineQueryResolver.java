package com.andreidodu.blm.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusLine;
import com.andreidodu.blm.service.BusLineService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BusLineQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private BusLineService service;

	public BusLine getBusLine(Long id) {
		return this.service.findById(id);
	}

	public List<BusLine> getBusLines() {
		return this.service.getAll();
	}

}
