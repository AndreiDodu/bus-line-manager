package com.andreidodu.blm.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.blm.dto.Booking;
import com.andreidodu.blm.dto.BusPath;
import com.andreidodu.blm.dto.Passenger;
import com.andreidodu.blm.dto.Seat;
import com.andreidodu.blm.service.BusPathService;
import com.andreidodu.blm.service.PassengerService;
import com.andreidodu.blm.service.SeatService;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class FieldBookingResolver implements GraphQLResolver<Booking> {

	@Autowired
	private SeatService seatService;

	@Autowired
	private PassengerService passengerService;

	@Autowired
	private BusPathService busPathService;

	public Passenger getPassenger(Booking booking) {
		return this.passengerService.findById(booking.passengerId());
	}

	public Seat getSeat(Booking booking) {
		return this.seatService.findById(booking.seatId());
	}

	public BusPath getBusPathStepStart(Booking booking) {
		return this.busPathService.findById(booking.busPathStepStartId());
	}

	public BusPath getBusPathStepEnd(Booking booking) {
		return this.busPathService.findById(booking.busPathStepEndId());
	}
}
