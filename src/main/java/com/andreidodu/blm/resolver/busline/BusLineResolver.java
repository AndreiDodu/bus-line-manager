package com.andreidodu.blm.resolver.busline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusLine;
import com.andreidodu.blm.service.BusLineService;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class BusLineResolver implements GraphQLResolver<BusLine> {

	@Autowired
	private BusLineService busLineService;

	public BusLine getFieldBusLineEndId(Long id) {
		return this.busLineService.findById(id);
	}

	public BusLine getFieldBusLineStartId(Long id) {
		return this.busLineService.findById(id);
	}

}
