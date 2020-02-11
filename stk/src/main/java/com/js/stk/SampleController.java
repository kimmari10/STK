package com.js.stk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

	@GetMapping("/hello2")
	public String hello(Model model) {
		
		model.addAttribute("name", "js");
		
		return "hello2";
	}
	
}
