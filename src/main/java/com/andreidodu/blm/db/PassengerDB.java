package com.andreidodu.blm.db;

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
@Table(name = "passenger")
public class PassengerDB extends CommonDB {

	@Id
	@Column(name = "passenger_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name", length = 255, nullable = false)
	private String firstName;

	@Column(name = "second_name", length = 255, nullable = false)
	private String secondName;

	@OneToMany(mappedBy = "passenger", fetch = FetchType.LAZY)
	private Set<BookingDB> booking;

}
