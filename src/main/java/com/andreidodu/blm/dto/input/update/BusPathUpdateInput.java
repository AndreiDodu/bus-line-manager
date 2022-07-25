package com.andreidodu.blm.dto.input.update;

import java.util.Date;

import lombok.Data;

@Data
public class BusPathUpdateInput {
	private Long busLineId;
	private Date pathDate;
}
