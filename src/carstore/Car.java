package carstore;

public class Car {
	Tire tire;

	public Car() {
		tire = new KoreanTire();
		// tire = new AmericanTire();
	}

	public String getTireBrand() {
		return "현재 타이어: " + tire.getBrand();
	}
}
