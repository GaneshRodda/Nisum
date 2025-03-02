package com.nisum.microservice1.Microservice11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@Value("${server.port}")
	private String port;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/micro1")
	public String test(){
		return port;
	}

}
