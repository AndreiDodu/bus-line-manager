package com.andreidodu.buslinemanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

	private Long id;
	private Seat seat;
	private Passenger passenger;
	private BusPath busPathStart;
	private BusPath busPathEnd;

}
