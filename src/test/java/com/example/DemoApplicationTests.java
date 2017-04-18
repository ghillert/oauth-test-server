package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(
	webEnvironment=WebEnvironment.RANDOM_PORT,
	classes = DemoApplication.class
)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
