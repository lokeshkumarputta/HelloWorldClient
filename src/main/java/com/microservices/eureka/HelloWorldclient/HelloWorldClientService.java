package com.microservices.eureka.HelloWorldclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/hello/client/")
public class HelloWorldClientService {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String Hello() {
		System.out.println("IN Client calling the another server");
		return restTemplate.getForObject("http://localhost:8071/rest/hello/server/", String.class);
	}
}
