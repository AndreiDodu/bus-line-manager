package com.andreidodu.blm.service;

import com.andreidodu.blm.dto.Passenger;
import com.andreidodu.blm.dto.input.insert.PassengerInsertInput;

import graphql.schema.DataFetchingEnvironment;

public interface PassengerService extends CommonService<Passenger, PassengerInsertInput> {

	Passenger save(PassengerInsertInput data, DataFetchingEnvironment env);

}
