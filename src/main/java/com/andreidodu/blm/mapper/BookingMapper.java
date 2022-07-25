package com.andreidodu.blm.mapper;

import org.springframework.stereotype.Component;

import com.andreidodu.blm.db.BookingDB;
import com.andreidodu.blm.dto.Booking;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

@Component
public class BookingMapper extends ConfigurableMapper {

	@Override
	public void configure(MapperFactory mapperFactory) {
		mapperFactory.classMap(BookingDB.class, Booking.class).exclude("passenger").exclude("seat")
				.exclude("busPathStepStart").exclude("busPathStepEnd").byDefault().register();
	}
}
