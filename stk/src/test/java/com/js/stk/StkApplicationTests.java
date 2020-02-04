package com.js.stk;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class StkApplicationTests {

	@Autowired
	Environment env;
	
	@Test
	void contextLoads() {
		assertThat(env.getProperty("js.name"))
				.isEqualTo("jskim");
	}

}
