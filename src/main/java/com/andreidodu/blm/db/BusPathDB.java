package com.andreidodu.blm.db;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "bus_path")

public class BusPathDB extends CommonDB {

	@Id
	@Column(name = "bus_path_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "bus_line_id")
	private Long busLineId;

	@Column(name = "path_date")
	private Date pathDate;

	@OneToMany(mappedBy = "busPathDB", fetch = FetchType.LAZY)
	private Set<BusPathStepDB> busPathStepsDB;

}
