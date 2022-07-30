package com.andreidodu.blm.dto;

import java.util.Date;
import java.util.List;

//// @formatter:off
 
public record BusPath(
		long id, 
		long busLineId, 
		Date pathDate, 
		BusLine busLine, 
		List<BusPathStep> busPathSteps
		) {
}

// @formatter:on