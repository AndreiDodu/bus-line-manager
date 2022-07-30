package com.andreidodu.blm.mapper;

import org.mapstruct.Mapper;

import com.andreidodu.blm.db.BusLineDB;
import com.andreidodu.blm.dto.BusLine;
import com.andreidodu.blm.dto.input.insert.BusLineInsertInput;

@Mapper(componentModel = "spring")
public interface BusLineMapper extends CommonMapper<BusLine, BusLineDB, BusLineInsertInput> {

}
