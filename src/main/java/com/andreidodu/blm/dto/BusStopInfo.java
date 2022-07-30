package com.andreidodu.blm.dto;

import java.util.List;

//// @formatter:off
 
public record BusStopInfo(
		int passengersCount, 
		List<Passenger> passengers) {
}
// @formatter:on
