package update_carstore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void testCar() {
		Tire tire = new KoreanTire();
		Car car = new Car();
		car.setTire(tire);
		
		assertEquals("���� Ÿ�̾�: �ѱ� Ÿ�̾�", car.getTireBrand());
	}
	
	@Test
	void testCarAmericanTire() {
		Tire tire = new AmericanTire();
		Car car = new Car();
		car.setTire(tire);
		
		assertEquals("���� Ÿ�̾�: �̱� Ÿ�̾�", car.getTireBrand());
	}

}
