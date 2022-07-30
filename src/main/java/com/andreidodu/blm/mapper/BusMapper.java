package com.andreidodu.blm.mapper;

import org.mapstruct.Mapper;

import com.andreidodu.blm.db.BusDB;
import com.andreidodu.blm.dto.Bus;
import com.andreidodu.blm.dto.input.insert.BusInsertInput;

@Mapper(componentModel = "spring")
public interface BusMapper extends CommonMapper<Bus, BusDB, BusInsertInput> {

}
