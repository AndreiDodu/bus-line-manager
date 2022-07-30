package com.andreidodu.blm.dto.input.insert;
///// @formatter:off
 

public record BookingInsertInput(
		long seatId, 
		long passengerId, 
		long busPathStepStartId, 
		long busPathStepEndId) {
}

// @formatter:on