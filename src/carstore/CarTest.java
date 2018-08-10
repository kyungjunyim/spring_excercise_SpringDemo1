package carstore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void testTire() {
		Car car = new Car();
		assertEquals("현재 타이어: 한국 타이어", car.getTireBrand());
	}

}
