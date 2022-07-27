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

	@Column(name = "seat_id", nullable = false)
	private Long seatId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "passenger_id", nullable = false, insertable = false, updatable = false)
	private PassengerDB passenger;

	@Column(name = "passenger_id", nullable = false)
	private Long passengerId;

	@Column(name = "bus_path_step_id_start")
	private Long busPathStepStartId;

	@Column(name = "bus_path_step_id_end")
	private Long busPathStepEndId;

}
