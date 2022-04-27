package com.empl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringEmployeeClientDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeeClientDiscoveryApplication.class, args);
	}

}
