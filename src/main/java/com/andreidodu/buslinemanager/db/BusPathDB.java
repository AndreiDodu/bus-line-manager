package com.andreidodu.buslinemanager.db;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "bus_path")
public class BusPathDB extends CommonDB {

	@Id
	@Column(name = "bus_path_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "bus_stop_id", nullable = false)
	private BusStopDB busStop;

	@ManyToOne
	@JoinColumn(name = "bus_line_id", nullable = false)
	private BusLineDB busLine;

	@Basic
	@Temporal(TemporalType.TIME)
	@Column(name = "expected_arrival_time")
	private Date expectedArrivalTime;

	@Basic
	@Temporal(TemporalType.TIME)
	@Column(name = "departure_time")
	private Date departureTime;

}
