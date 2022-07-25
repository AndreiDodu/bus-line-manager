package com.andreidodu.blm.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.BusPath;
import com.andreidodu.blm.service.BusPathService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BusPathQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private BusPathService service;

	public BusPath getBusPath(Long id) {
		return this.service.findById(id);
	}

	public List<BusPath> getBusPaths() {
		return this.service.getAll();
	}

}
