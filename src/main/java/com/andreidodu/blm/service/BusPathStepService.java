package com.andreidodu.blm.service;

import java.util.List;

import com.andreidodu.blm.dto.BusPathStep;
import com.andreidodu.blm.dto.input.insert.BusPathStepInsertInput;

public interface BusPathStepService extends CommonService<BusPathStep, BusPathStepInsertInput> {

	List<BusPathStep> findByBusPathId(Long busPathId);

}
