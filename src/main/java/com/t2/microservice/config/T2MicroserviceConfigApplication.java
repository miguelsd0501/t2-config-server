package com.t2.microservice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class T2MicroserviceConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(T2MicroserviceConfigApplication.class, args);
	}

}

