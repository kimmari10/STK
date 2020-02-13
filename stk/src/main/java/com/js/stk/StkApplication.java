package com.js.stk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StkApplication {

	public static void main(String[] args) {
		SpringApplication.run(StkApplication.class, args);
	}

}
