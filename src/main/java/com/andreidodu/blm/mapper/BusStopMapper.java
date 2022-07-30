package com.andreidodu.blm.mapper;

import org.mapstruct.Mapper;

import com.andreidodu.blm.db.BusStopDB;
import com.andreidodu.blm.dto.BusStop;
import com.andreidodu.blm.dto.input.insert.BusStopInsertInput;

@Mapper(componentModel = "spring")
public interface BusStopMapper extends CommonMapper<BusStop, BusStopDB, BusStopInsertInput> {

}
