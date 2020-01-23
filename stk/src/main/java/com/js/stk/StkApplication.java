package com.js.stk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import me.js.jsSpringBootStarter.Holoman;

@SpringBootApplication
public class StkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StkApplication.class, args);
		SpringApplication application = new SpringApplication(StkApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}
	
	@Bean
	public Holoman holoman() {
		Holoman holoman = new Holoman();
		holoman.setHowLong(10);
		holoman.setName("jongc");
		return holoman;
	}

}
