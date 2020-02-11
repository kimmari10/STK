package com.js.stk;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class SampleControllerTest {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void hello() throws Exception {
		mockMvc.perform(get("/hello2"))
			.andExpect(status().isOk())
			.andExpect(view().name("hello2"))
			.andDo(print())
			.andExpect(model().attribute("name", "js"));
			
	}
}
