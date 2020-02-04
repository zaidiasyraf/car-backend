package com.zaidi.cardatabase;

import com.zaidi.cardatabase.controller.CarController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class CardatabaseApplicationTests {

	@Autowired
	private CarController carController;

	@Test
	void contextLoads() {
		Assertions.assertThat(carController).isNotNull();
	}

}
