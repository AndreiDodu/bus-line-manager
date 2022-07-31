package com.andreidodu.blm.dto;

import java.util.Map;

///// @formatter:off
 

public record Bus(
		long id, 
		int capacity,
		long busLineId,
		Map<String, Object> fields
		) {}

// @formatter:on