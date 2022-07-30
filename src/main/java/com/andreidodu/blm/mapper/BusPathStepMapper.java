package com.andreidodu.blm.mapper;

import org.mapstruct.Mapper;

import com.andreidodu.blm.db.BusPathStepDB;
import com.andreidodu.blm.dto.BusPathStep;
import com.andreidodu.blm.dto.input.insert.BusPathStepInsertInput;

@Mapper(componentModel = "spring")
public interface BusPathStepMapper extends CommonMapper<BusPathStep, BusPathStepDB, BusPathStepInsertInput> {

}
