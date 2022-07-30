package com.andreidodu.blm.mapper;

import org.mapstruct.Mapper;

import com.andreidodu.blm.db.BookingDB;
import com.andreidodu.blm.dto.Booking;
import com.andreidodu.blm.dto.input.insert.BookingInsertInput;

@Mapper(componentModel = "spring")
public interface BookingMapper extends CommonMapper<Booking, BookingDB, BookingInsertInput> {

}
