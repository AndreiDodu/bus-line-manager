package com.andreidodu.blm.resolver.buspath;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusPath;
import com.andreidodu.blm.service.BusPathService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BusPathQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private BusPathService busPathService;

	public BusPath getBusPath(Long id) {
		return this.busPathService.findById(id);
	}

	public List<BusPath> getBusPaths() {
		return this.busPathService.getAll();
	}

}
