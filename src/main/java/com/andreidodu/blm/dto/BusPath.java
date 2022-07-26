package com.andreidodu.blm.dto;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BusPath {

	private Long id;
	private Long busLineId;
	private Date pathDate;
	private BusLine busLine;
	List<BusPathStep> busPathSteps;
}
