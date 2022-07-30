package com.andreidodu.blm.mapper;

import org.mapstruct.Mapper;

import com.andreidodu.blm.db.SeatDB;
import com.andreidodu.blm.dto.Seat;
import com.andreidodu.blm.dto.input.insert.SeatInsertInput;

@Mapper(componentModel = "spring")
public interface SeatMapper extends CommonMapper<Seat, SeatDB, SeatInsertInput> {

}
