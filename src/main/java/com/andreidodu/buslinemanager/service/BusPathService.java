package com.andreidodu.buslinemanager.service;

import com.andreidodu.buslinemanager.dto.BusPath;
import com.andreidodu.buslinemanager.dto.input.insert.BusPathInsertInput;

public interface BusPathService {

	BusPath findById(Long id);

	BusPath save(BusPathInsertInput data);

	BusPath update(Long id, BusPathInsertInput data);

}
