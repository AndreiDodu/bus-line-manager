package com.andreidodu.buslinemanager.db;

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
@Table(name = "bus_stop")
public class BusStopDB extends CommonDB {

	@Id
	@Column(name = "bus_stop_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", length = 255, nullable = false)
	private String name;

	@OneToMany(mappedBy = "busStop", fetch = FetchType.LAZY)
	private Set<BusPathDB> busPaths;

}
