package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsTestApplication {
	@GetMapping
	public String hi(){
		return "Hi";
	}
	public static void main(String[] args) {
		SpringApplication.run(DevopsTestApplication.class, args);
	}

}
