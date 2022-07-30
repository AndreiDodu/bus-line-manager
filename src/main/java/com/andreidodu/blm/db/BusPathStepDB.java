package com.andreidodu.blm.db;

import java.util.Date;

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
@Table(name = "bus_path_step")
public class BusPathStepDB extends CommonDB {

	@Id
	@Column(name = "bus_path_step_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "bus_stop_id", nullable = false)
	private Long busStopId;

	@Column(name = "expected_arrival_time")
	private Date expectedArrivalTime;

	@Column(name = "departure_time")
	private Date departureTime;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bus_path_id", nullable = false, insertable = false, updatable = false)
	private BusPathDB busPathDB;

	@Column(name = "bus_path_id", nullable = false)
	private Long busPathId;

}
