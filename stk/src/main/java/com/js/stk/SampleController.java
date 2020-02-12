package com.js.stk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@GetMapping("/hello2")
	public String hello(Model model) {
		
		model.addAttribute("name", "js");
		
		return "hello2";
	}
	
	@GetMapping("/helloError")
	public String helloError() {
		throw new SampleException();
	}
	
	@ExceptionHandler(SampleException.class)
	public @ResponseBody AppError sampleError(SampleException e) {
		AppError appError = new AppError();
		appError.setMessage("error.app.key");
		appError.setReason("IDK");
		return appError;
	}
	
}
