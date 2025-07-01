package com.kiko.kiko_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController    // this annotation describes an endpoint should be made available over the web
public class KikoCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(KikoCoreApplication.class, args);
	}

	// get mapping, tells Spring to use hello() method for answering requests
	// sent to https://localhost:8080/hello
	// @RequestParam tells Spring to expect a 'text' value in the request
	// if no value provided, then use the defaultValue which is "default live"
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "text", defaultValue = "World!") String text) {
		return String.format("Hello " + text);
	}
}
