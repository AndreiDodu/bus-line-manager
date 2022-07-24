package com.andreidodu.buslinemanager.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.buslinemanager.dto.BusLine;
import com.andreidodu.buslinemanager.service.BusLineService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BusLineQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private BusLineService busLineService;

	public BusLine getBusLine(Long id) {
		return this.busLineService.findById(id);
	}

	public List<BusLine> getBuseLines() {
		return this.busLineService.getAll();
	}

}
