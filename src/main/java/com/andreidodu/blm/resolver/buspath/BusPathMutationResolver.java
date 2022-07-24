package com.andreidodu.blm.resolver.buspath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusPath;
import com.andreidodu.blm.dto.input.insert.BusPathInsertInput;
import com.andreidodu.blm.service.BusPathService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class BusPathMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private BusPathService busPathService;

	public BusPath insertBusPath(BusPathInsertInput data) {
		return this.busPathService.save(data);
	}

	public BusPath updateBusPath(Long id, BusPathInsertInput data) {
		return this.busPathService.update(id, data);
	}

}
