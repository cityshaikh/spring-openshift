package com.example.demoopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoOpenshiftApplication {

	@GetMapping("/")
	public String getData(){
		return "Welcome to Spring Boot - OpenShift";
	}
	@GetMapping("/{input}")
	public String getData2(@PathVariable String input){
		return "<h1>Hi "+input+" Welcome to Spring Boot - OpenShift</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoOpenshiftApplication.class, args);
	}



}
