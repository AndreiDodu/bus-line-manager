package com.andreidodu.blm.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BusPathStep {

	private Long id;
	private BusStop busStop;
	private Long busStopId;
	// private BusPath busPath;
	private Date expectedArrivalTime;
	private Date departureTime;
}
