package new_carstore;

public class Car {
	Tire tire;
	
	public Car(Tire tire) {
		// tire = new Tire();
		this.tire = tire;
	}
	
	public String getTireBrand() {
		return "현재 타이어: " + tire.getBrand();
	}
}
