package com.microservice.timeLine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// Habilita el cliente feign dentro del microservicio
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class TimeLineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeLineApplication.class, args);
	}

}
