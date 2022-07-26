package com.andreidodu.blm.mapper;

import org.springframework.stereotype.Component;

import com.andreidodu.blm.db.BookingDB;
import com.andreidodu.blm.db.BusPathDB;
import com.andreidodu.blm.db.BusPathStepDB;
import com.andreidodu.blm.dto.Booking;
import com.andreidodu.blm.dto.BusPath;
import com.andreidodu.blm.dto.BusPathStep;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

@Component
public class MapperConfiguration extends ConfigurableMapper {

	@Override
	public void configure(MapperFactory mapperFactory) {

		mapperFactory.classMap(BookingDB.class, Booking.class).exclude("passenger").exclude("seat")
				.exclude("busPathStepStart").exclude("busPathStepEnd")

				.byDefault().register();

		mapperFactory.classMap(BusPathDB.class, BusPath.class).exclude("busPathSteps").exclude("busLine")
				.field("busLine.id", "busLineId").byDefault().register();

		mapperFactory.classMap(BusPathStepDB.class, BusPathStep.class).exclude("busStop").exclude("busPath").byDefault()
				.register();
	}
}
