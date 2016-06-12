package com.hdbandit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ExampleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleServiceApplication.class, args);
	}

}
