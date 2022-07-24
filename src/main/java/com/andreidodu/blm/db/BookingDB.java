package com.andreidodu.blm.db;

import javax.persistence.Column;
import javax.persistence.Entity;
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

	@ManyToOne
	@JoinColumn(name = "seat_id", nullable = false)
	private SeatDB seat;

	@ManyToOne
	@JoinColumn(name = "passenger_id", nullable = false)
	private PassengerDB passenger;

	@ManyToOne
	@JoinColumn(name = "bus_path_id_start", nullable = false)
	private BusPathDB busPathStart;

	@ManyToOne
	@JoinColumn(name = "bus_path_id_end", nullable = false)
	private BusPathDB busPathEnd;

}
