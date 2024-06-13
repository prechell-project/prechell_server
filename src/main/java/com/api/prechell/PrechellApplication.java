package com.api.prechell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PrechellApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrechellApplication.class, args);
	}

}
