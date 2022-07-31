package com.andreidodu.blm.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.andreidodu.blm.db.PassengerDB;
import com.andreidodu.blm.dto.Passenger;
import com.andreidodu.blm.dto.input.insert.PassengerInsertInput;
import com.andreidodu.blm.mapper.PassengerMapper;
import com.andreidodu.blm.repository.PassengerDao;
import com.andreidodu.blm.service.PassengerService;

import graphql.schema.DataFetchingEnvironment;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class PassengerServiceImpl
		extends CommonServiceImpl<Passenger, PassengerDB, PassengerDao, PassengerInsertInput, Long, PassengerMapper>
		implements PassengerService {

	@Autowired
	private PassengerDao passengerDao;

	@Autowired
	private Environment env;

	public PassengerServiceImpl() {
		super(Passenger.class, PassengerDB.class);
	}

	public PassengerDao getDao() {
		return this.passengerDao;
	}

	public Passenger save(PassengerInsertInput data, DataFetchingEnvironment env) {
		Map<String, Object> dta = env.getArgument("data");
		List<Part> attachmentParts = (List<Part>) dta.get("files");
		if (attachmentParts != null) {
			int i = 1;
			final String path = this.env.getProperty("file.upload.path");
			for (Part part : attachmentParts) {
				String uploadName = part.getName();
				try {
					part.write(path + "/" + uploadName);
					System.out.println(part);
				} catch (IOException e) {
					e.printStackTrace();
				}
				i++;
			}
		}
		return super.save(data);
	}

}
