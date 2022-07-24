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
@Table(name = "seat")
public class SeatDB extends CommonDB {

	@Id
	@Column(name = "seat_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "code", length = 3, nullable = false)
	private String code;

	@OneToMany(mappedBy = "seat", fetch = FetchType.LAZY)
	private Set<BookingDB> booking;

}
