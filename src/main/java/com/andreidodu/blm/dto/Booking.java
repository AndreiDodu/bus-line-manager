package com.andreidodu.blm.dto;
///// @formatter:off
 

public record Booking(
		long id, 
		long seatId, 
		long passengerId, 
		long busPathStepStartId, 
		long busPathStepEndId,
		Seat seat, 
		Passenger passenger
		) {}

// @formatter:on