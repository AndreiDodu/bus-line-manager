package com.andreidodu.blm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

	private Long id;

	private Long seatId;
	private Long passengerId;
	private Long busPathStepStartId;
	private Long busPathStepEndId;

	private Seat seat;
	private Passenger passenger;

}
