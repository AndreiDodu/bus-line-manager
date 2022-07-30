package com.andreidodu.blm.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.MappingTarget;

public interface CommonMapper<DTOType, DBType, InsertDTOType> {

	DTOType toDTO(DBType db);

	DBType toDB(DTOType dto);

	DTOType mapToDTO(DBType db);

	DBType mapToDB(DTOType dto, @MappingTarget DBType db);

	DBType mapIDTOToDB(InsertDTOType dto);

	DBType mapUDTOToDB(@MappingTarget DBType db, InsertDTOType dto);

	default List<DTOType> toDTOList(List<DBType> dbs) {
		List<DTOType> result = new ArrayList<>();
		dbs.forEach(db -> result.add(this.toDTO(db)));
		return result;
	}
}
