package com.andreidodu.blm.util;

import java.io.IOException;

import javax.servlet.http.Part;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class PartDeserializer extends JsonDeserializer<Part> {

	@Override
	public Part deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		return null;
	}
}
