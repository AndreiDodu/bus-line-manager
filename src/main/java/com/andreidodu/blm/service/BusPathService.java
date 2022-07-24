package com.andreidodu.blm.service;

import com.andreidodu.blm.dto.BusPath;
import com.andreidodu.blm.dto.input.insert.BusPathInsertInput;

public interface BusPathService {

	BusPath findById(Long id);

	BusPath save(BusPathInsertInput data);

	BusPath update(Long id, BusPathInsertInput data);

}
