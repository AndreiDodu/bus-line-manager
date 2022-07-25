package com.andreidodu.blm.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusPathStep {

	private Long id;
	private BusStop busStop;
	private BusPath busPath;
	private Date expectedArrivalTime;
	private Date departureTime;
}
