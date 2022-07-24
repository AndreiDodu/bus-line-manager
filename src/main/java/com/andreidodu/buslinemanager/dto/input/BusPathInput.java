package com.andreidodu.buslinemanager.dto.input;

import java.util.Date;

import lombok.Data;

@Data
public class BusPathInput {
	private Long busStopId;
	private Long busLineId;
	private Date expectedArrivalTime;
	private Date departureTime;
}
