package com.andreidodu.blm.dto.input.insert;

import java.util.Date;

import lombok.Data;

@Data
public class BusPathInsertInput {
	private Long busLineId;
	private Date pathDate;
}
