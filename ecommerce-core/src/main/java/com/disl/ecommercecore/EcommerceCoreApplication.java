package com.disl.ecommercecore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.disl.auth"})
@ComponentScan(basePackages = {"com.disl.auth.security"})
@ComponentScan(basePackages = {"com.disl.auth.config"})
@EntityScan(basePackages = {"com.disl.auth.models"})
public class EcommerceCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceCoreApplication.class, args);
	}

}
