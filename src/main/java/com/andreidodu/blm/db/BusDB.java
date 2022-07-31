package com.andreidodu.blm.db;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.json.JsonType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "bus")
@TypeDef(name = "json", typeClass = JsonType.class)
@EqualsAndHashCode(exclude = { "busLines" }, callSuper = true)
public class BusDB extends CommonDB {

	@Id
	@Column(name = "bus_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "capacity", nullable = false)
	private Integer capacity;

	@Type(type = "json")
	@Column(name = "fields", nullable = false, columnDefinition = "jsonb")
	private String fieldsJSON;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "bus_bus_line", joinColumns = { @JoinColumn(name = "bus_id") }, inverseJoinColumns = {
			@JoinColumn(name = "bus_line_id") })
	Set<BusLineDB> busLines = new HashSet<>();

}
