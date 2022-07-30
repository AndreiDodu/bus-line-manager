package com.andreidodu.blm.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusLine;
import com.andreidodu.blm.dto.BusPath;
import com.andreidodu.blm.dto.BusPathStep;
import com.andreidodu.blm.service.BusLineService;
import com.andreidodu.blm.service.BusPathStepService;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class FieldBusPathResolver implements GraphQLResolver<BusPath> {

	@Autowired
	private BusPathStepService busPathStepService;

	@Autowired
	private BusLineService busLineService;

	public List<BusPathStep> getBusPathSteps(BusPath busPath) {
		return this.busPathStepService.findByBusPathId(busPath.id());
	}

	public BusLine getBusLine(BusPath busPath) {
		return this.busLineService.findById(busPath.busLineId());
	}
}
