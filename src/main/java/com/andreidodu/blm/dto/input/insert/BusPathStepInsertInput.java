package com.andreidodu.blm.dto.input.insert;

import java.util.Date;
//// @formatter:off
 

public record BusPathStepInsertInput(
		long busStopId, 
		long busPathId, 
		Date expectedArrivalTime, 
		Date departureTime
		) {
}

// @formatter:on