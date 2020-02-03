package com.js.stk;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationListener<ApplicationStartedEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		System.out.println("application is started");
		
	}

}
