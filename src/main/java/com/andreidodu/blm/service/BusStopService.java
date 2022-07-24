package com.andreidodu.blm.service;

import com.andreidodu.blm.dto.BusStop;
import com.andreidodu.blm.dto.BusStopInfo;
import com.andreidodu.blm.dto.input.insert.BusStopInsertInput;

public interface BusStopService extends CommonService<BusStop, BusStopInsertInput> {
	
	public BusStopInfo getGetOffPassengers(Long currentBusPathId);

	public BusStopInfo getGetOnPassengers(Long currentBusPathId);
}
