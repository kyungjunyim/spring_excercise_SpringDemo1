package carstore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void testTire() {
		Car car = new Car();
		assertEquals("���� Ÿ�̾�: �ѱ� Ÿ�̾�", car.getTireBrand());
	}

}
