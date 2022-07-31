package com.andreidodu.blm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	GraphQLScalarType longTypeJson() {
		return ExtendedScalars.Json;
	}

}
