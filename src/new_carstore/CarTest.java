package new_carstore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void testCar() {
		Tire tire = new KoreanTire();
		Car car = new Car(tire);
		assertEquals("현재 타이어: 한국 타이어", car.getTireBrand());
	}
	
	@Test
	void testCarWithAmericanTire() {
		Tire tire = new AmericanTire();
		Car car = new Car(tire);
		assertEquals("현재 타이어: 미국 타이어", car.getTireBrand());
	}

}
