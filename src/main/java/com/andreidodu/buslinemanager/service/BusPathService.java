package com.andreidodu.buslinemanager.service;

import com.andreidodu.buslinemanager.dto.BusPath;
import com.andreidodu.buslinemanager.dto.input.BusPathInput;

public interface BusPathService {

	BusPath findById(Long id);

	BusPath save(BusPathInput data);

	BusPath update(Long id, BusPathInput data);

}
