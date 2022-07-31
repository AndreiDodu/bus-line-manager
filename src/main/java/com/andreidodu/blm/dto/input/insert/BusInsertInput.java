package com.andreidodu.blm.dto.input.insert;

import org.json.JSONObject;

public record BusInsertInput(int capacity, long busLineId, JSONObject fields) {

}
