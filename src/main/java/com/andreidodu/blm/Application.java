package com.andreidodu.blm;

import javax.servlet.http.Part;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.andreidodu.blm.util.PartDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import graphql.kickstart.servlet.apollo.ApolloScalars;
import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;

@PropertySource("classpath:settings.properties")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	GraphQLScalarType longTypeJson() {
		return ExtendedScalars.Json;
	}

	@Bean
	GraphQLScalarType uploadScalarDefine() {
		return ApolloScalars.Upload;
	}

	@Bean
	ObjectMapper objectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		SimpleModule module = new SimpleModule();
		module.addDeserializer(Part.class, new PartDeserializer());
		objectMapper.registerModule(module);
		return objectMapper;
	}
}
