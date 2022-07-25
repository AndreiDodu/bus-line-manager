package com.andreidodu.blm.dto.input.insert;

import lombok.Data;

@Data
public class BookingInsertInput {
	private Long seatId;
	private Long passengerId;
	private Long busPathStepStartId;
	private Long busPathStepEndId;
}
