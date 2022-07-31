package com.andreidodu.blm.dto.input.insert;

import java.util.List;

import javax.servlet.http.Part;

public record PassengerInsertInput(String firstName, String secondName, List<Part> files, String submittedFileName,
		String contentType) {
}
