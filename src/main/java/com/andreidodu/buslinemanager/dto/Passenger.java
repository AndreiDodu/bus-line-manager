package com.andreidodu.buslinemanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {

	private Long id;
	private String firstName;
	private String secondName;

}