package com.andreidodu.buslinemanager.dto.input;

import lombok.Data;

@Data
public class BookingInput {
	private Long seatId;
	private Long passengerId;
	private Long busPathStartId;
	private Long busPathEndId;
}
