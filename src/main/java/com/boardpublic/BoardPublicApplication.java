package com.boardpublic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class BoardPublicApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardPublicApplication.class, args);
	}

}
