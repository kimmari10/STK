package com.js.stk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner{

	@Autowired
	JsProperties jsProperties;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("js name : " + jsProperties.getName());
		System.out.println("js age : " + jsProperties.getAge());
	}

}
