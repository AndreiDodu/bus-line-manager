package com.andreidodu.blm.dto.input.update;

import lombok.Data;

@Data
public class BookingUpdateInput {
	private Long seatId;
	private Long passengerId;
	private Long busPathStartId;
	private Long busPathEndId;
}
