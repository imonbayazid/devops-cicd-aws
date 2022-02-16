package com.example.demo;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	Logger log = org.slf4j.LoggerFactory.getLogger(TestprojectApplication.class);

	@GetMapping("/test")
	public String test() {
		log.info("test log");
		return "this is a test...";
	}
	
	
	@GetMapping("/testmyerror")
	public String testmyerror() {
		log.error("test testmyerror");
		return "this is a testmyerror";
	}
	
	@GetMapping("/test2")
	public String test2() {
		log.info("test error test2");
		return "this is a test2....";
	}
	
	

}
