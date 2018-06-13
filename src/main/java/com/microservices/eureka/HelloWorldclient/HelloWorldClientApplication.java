package com.microservices.eureka.HelloWorldclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloWorldClientApplication {

	public static void main(String[] args) {
		System.out.println("Hello world client side started ");
		
		SpringApplication.run(HelloWorldClientApplication.class, args);
	}
}
