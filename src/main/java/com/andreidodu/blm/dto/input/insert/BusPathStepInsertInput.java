package com.andreidodu.blm.dto.input.insert;

import java.util.Date;

import lombok.Data;

@Data
public class BusPathStepInsertInput {
	private Long busStopId;
	private Long busPathId;
	private Date expectedArrivalTime;
	private Date departureTime;
}
