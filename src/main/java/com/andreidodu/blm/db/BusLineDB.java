package com.andreidodu.blm.db;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "bus_line")
public class BusLineDB extends CommonDB {

	@Id
	@Column(name = "bus_line_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", length = 255, nullable = false)
	private String name;

	@ManyToMany(mappedBy = "busLines")
	private Set<BusDB> employees = new HashSet<>();

	@OneToMany(mappedBy = "busLine", fetch = FetchType.LAZY)
	private Set<BusPathDB> busPaths;

}
