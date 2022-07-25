package com.andreidodu.blm.dto.input.update;

import java.util.Date;

import lombok.Data;

@Data
public class BusPathStepUpdateInput {
	private Long busStopId;
	private Long busPathId;
	private Date expectedArrivalTime;
	private Date departureTime;
}
