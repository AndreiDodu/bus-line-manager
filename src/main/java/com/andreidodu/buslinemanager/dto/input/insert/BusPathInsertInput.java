package com.andreidodu.buslinemanager.dto.input.insert;

import java.util.Date;

import lombok.Data;

@Data
public class BusPathInsertInput {
	private Long busStopId;
	private Long busLineId;
	private Date expectedArrivalTime;
	private Date departureTime;
}
