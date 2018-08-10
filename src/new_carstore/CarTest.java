package new_carstore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void testCar() {
		Tire tire = new KoreanTire();
		Car car = new Car(tire);
		assertEquals("���� Ÿ�̾�: �ѱ� Ÿ�̾�", car.getTireBrand());
	}
	
	@Test
	void testCarWithAmericanTire() {
		Tire tire = new AmericanTire();
		Car car = new Car(tire);
		assertEquals("���� Ÿ�̾�: �̱� Ÿ�̾�", car.getTireBrand());
	}

}
