package com.andreidodu.blm.mapper;

import java.util.Map;

import org.json.JSONObject;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.andreidodu.blm.db.BusDB;
import com.andreidodu.blm.dto.Bus;
import com.andreidodu.blm.dto.input.insert.BusInsertInput;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Mapper(componentModel = "spring")
public interface BusMapper extends CommonMapper<Bus, BusDB, BusInsertInput> {

	BusMapper INSTANCE = Mappers.getMapper(BusMapper.class);

	@Mapping(source = "fieldsJSON", target = "fields", qualifiedByName = "toJsonObject")
	public Bus toDTO(BusDB db);

	@Mapping(source = "fields", target = "fieldsJSON", qualifiedByName = "toStringJson")
	public BusDB mapIDTOToDB(BusInsertInput dto);

	@Mapping(source = "fields", target = "fieldsJSON", qualifiedByName = "toStringJson")
	BusDB mapUDTOToDB(@MappingTarget BusDB db, BusInsertInput dto);

	@Named("toJsonObject")
	default Map<String, Object> toJSON(String str) {
		Map<String, Object> obj = null;
		try {
			obj = str == null ? null : (new ObjectMapper()).readValue(str, new TypeReference<Map<String, Object>>() {
			});
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		;
		return obj;
	}

	@Named("toStringJson")
	default String toStringJSON(JSONObject json) {
		return json == null ? null : json.toString();
	}

}
