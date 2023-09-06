package com.reset.ServiceBB.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/serviceBB")
@SpringBootApplication
public class ServiceBbApplication {

	
	@GetMapping("/dataBB")
	public ResponseEntity<String> getDataFromBB(){
		return ResponseEntity.ok("Hello from ServiceBB.");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceBbApplication.class, args);
	}

}
