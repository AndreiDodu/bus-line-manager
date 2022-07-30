package com.andreidodu.blm.mapper;

import org.mapstruct.Mapper;

import com.andreidodu.blm.db.BusPathDB;
import com.andreidodu.blm.dto.BusPath;
import com.andreidodu.blm.dto.input.insert.BusPathInsertInput;

@Mapper(componentModel = "spring")
public interface BusPathMapper extends CommonMapper<BusPath, BusPathDB, BusPathInsertInput> {

}
