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
import lombok.ToString;

@Data
@Entity
@Table(name = "bus_path")
@ToString
public class BusPathDB extends CommonDB {

	@Id
	@Column(name = "bus_path_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bus_line_id", nullable = false)
	private BusLineDB busLine;

	@Column(name = "bus_line_id", insertable = false, updatable = false)
	private Long busLineId;

	@Column(name = "path_date")
	private Date pathDate;

}
