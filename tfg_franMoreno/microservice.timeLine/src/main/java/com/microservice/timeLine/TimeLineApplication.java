package com.microservice.timeLine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TimeLineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeLineApplication.class, args);
	}

}
