package com.andreidodu.blm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.andreidodu.blm.db.BookingDB;
import com.andreidodu.blm.db.BusPathStepDB;
import com.andreidodu.blm.db.PassengerDB;
import com.andreidodu.blm.db.SeatDB;
import com.andreidodu.blm.dto.Booking;
import com.andreidodu.blm.dto.input.insert.BookingInsertInput;
import com.andreidodu.blm.repository.BookingDao;
import com.andreidodu.blm.service.BookingService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BookingServiceImpl extends CommonServiceImpl<Booking, BookingDB, BookingDao, BookingInsertInput, Long>
		implements BookingService {

	@Autowired
	private BookingDao bookingDao;

	public BookingServiceImpl() {
		super(Booking.class, BookingDB.class);
	}

	public BookingDao getDao() {
		return this.bookingDao;
	}

	@Override
	public Booking save(BookingInsertInput data) {
		SeatDB seatDB = new SeatDB();
		seatDB.setId(data.getSeatId());

		PassengerDB passengerDB = new PassengerDB();
		passengerDB.setId(data.getPassengerId());

		BusPathStepDB busPathStart = new BusPathStepDB();
		busPathStart.setId(data.getBusPathStepStartId());

		BusPathStepDB busPathEnd = new BusPathStepDB();
		busPathEnd.setId(data.getBusPathStepEndId());

		BookingDB bookingDB = new BookingDB();
		super.getMapper().map(data, bookingDB);

		return this.getMapper().map(this.bookingDao.save(bookingDB), Booking.class);
	}

}
