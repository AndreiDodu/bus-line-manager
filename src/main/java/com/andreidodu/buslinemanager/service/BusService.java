package com.andreidodu.buslinemanager.service;

import java.util.List;

import com.andreidodu.buslinemanager.dto.Bus;
import com.andreidodu.buslinemanager.dto.input.BusInput;

public interface BusService {

	Bus findById(Long id);

	List<Bus> getAll();

	Bus save(BusInput data);

	Bus update(Long id, BusInput data);

}
