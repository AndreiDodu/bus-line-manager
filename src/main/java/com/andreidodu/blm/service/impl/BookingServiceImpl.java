package com.andreidodu.blm.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreidodu.blm.dao.BookingDao;
import com.andreidodu.blm.db.BookingDB;
import com.andreidodu.blm.db.BusPathDB;
import com.andreidodu.blm.db.PassengerDB;
import com.andreidodu.blm.db.SeatDB;
import com.andreidodu.blm.dto.Booking;
import com.andreidodu.blm.dto.input.insert.BookingInsertInput;
import com.andreidodu.blm.service.BookingService;

@Service
@Transactional
public class BookingServiceImpl extends CommonServiceImpl<Booking, BookingDB, BookingDao, BookingInsertInput>
		implements BookingService {

	@Autowired
	private BookingDao bookingDao;

	@Override
	public Booking save(BookingInsertInput data) {
		SeatDB seatDB = new SeatDB();
		seatDB.setId(data.getSeatId());

		PassengerDB passengerDB = new PassengerDB();
		passengerDB.setId(data.getPassengerId());

		BusPathDB busPathStart = new BusPathDB();
		busPathStart.setId(data.getBusPathStartId());

		BusPathDB busPathEnd = new BusPathDB();
		busPathEnd.setId(data.getBusPathEndId());

		BookingDB bookingDB = new BookingDB();
		bookingDB.setSeat(seatDB);
		bookingDB.setPassenger(passengerDB);
		bookingDB.setBusPathStart(busPathStart);
		bookingDB.setBusPathEnd(busPathEnd);
		super.getMapper().map(data, bookingDB);

		return this.getMapper().map(this.bookingDao.save(bookingDB), Booking.class);
	}

	public BookingServiceImpl() {
		super(Booking.class, BookingDB.class);
	}

	public BookingDao getDao() {
		return this.bookingDao;
	}

}
