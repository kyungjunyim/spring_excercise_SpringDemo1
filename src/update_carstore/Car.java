package update_carstore;

public class Car {
	Tire tire;
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public Tire getTire() {
		return tire;
	}
	
	public String getTireBrand() {
		return "���� Ÿ�̾�: " + tire.getBrand();
	}
}
