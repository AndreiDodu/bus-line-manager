package com.andreidodu.blm.dto;

import java.util.List;

import lombok.Data;

@Data
public class BusStopInfo {
	
	private Integer passengersCount;
	private List<Passenger> passengers;
	
}
