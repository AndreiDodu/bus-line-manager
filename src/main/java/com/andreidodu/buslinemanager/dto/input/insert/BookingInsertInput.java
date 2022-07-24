package com.andreidodu.buslinemanager.dto.input.insert;

import lombok.Data;

@Data
public class BookingInsertInput {
	private Long seatId;
	private Long passengerId;
	private Long busPathStartId;
	private Long busPathEndId;
}
