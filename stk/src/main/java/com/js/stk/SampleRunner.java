package com.js.stk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner{

	@Autowired
	private String name;
	
	@Autowired
	private JsProperties jsProperties;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("======================");
		System.out.println(jsProperties.getName());
		System.out.println("======================");
	}

}
