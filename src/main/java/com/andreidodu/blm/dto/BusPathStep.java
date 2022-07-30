package com.andreidodu.blm.dto;

import java.util.Date;

//// @formatter:off
 

public record BusPathStep(
		long id, 
		BusStop busStop, 
		long busStopId, 
		long busPathId, 
		Date expectedArrivalTime, 
		Date departureTime,
		BusPath busPath
		) {
}

// @formatter:on