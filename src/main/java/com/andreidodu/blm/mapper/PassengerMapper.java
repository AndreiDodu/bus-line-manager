package com.andreidodu.blm.mapper;

import org.mapstruct.Mapper;

import com.andreidodu.blm.db.PassengerDB;
import com.andreidodu.blm.dto.Passenger;
import com.andreidodu.blm.dto.input.insert.PassengerInsertInput;

@Mapper(componentModel = "spring")
public interface PassengerMapper extends CommonMapper<Passenger, PassengerDB, PassengerInsertInput> {

}
