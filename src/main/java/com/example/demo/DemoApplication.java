package com.example.demo;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class DemoApplication {
	
	Logger log = org.slf4j.LoggerFactory.getLogger(DemoApplication.class);

	@GetMapping("/test")
	public String test() {
		log.info("test log");
		return "this is a test";
	}
	
	@GetMapping("/error")
	public String error() {
		log.error("test error");
		return "this is a error";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
