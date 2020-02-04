package com.js.stk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner{

	@Value("${js.name}")
	String name;
	
	@Value("${js.age}")
	int age;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("js name : " + name);
		System.out.println("js age : " + age);
	}

}
