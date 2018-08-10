package update_carstore;

public class Factory {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlAppicationContext("");
		Tire tire = (Tire) context.getBean("tire");
		Car car = (Car) context.getBean("car");
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
	}
}
