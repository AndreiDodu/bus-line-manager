package com.andreidodu.blm.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "booking")
public class BookingDB extends CommonDB {

	@Id
	@Column(name = "booking_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seat_id", nullable = false)
	private SeatDB seat;

	@Column(name = "seat_id", insertable = false, updatable = false)
	private Long seatId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "passenger_id", nullable = false)
	private PassengerDB passenger;

	@Column(name = "passenger_id", insertable = false, updatable = false)
	private Long passengerId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bus_path_step_id_start", nullable = false)
	private BusPathStepDB busPathStepStart;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bus_path_step_id_end", nullable = false)
	private BusPathStepDB busPathStepEnd;

}
