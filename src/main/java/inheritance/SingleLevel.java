package inheritance;

class Vehicles {
	int maxSpeed;
	String bran;
	public void drive() {
		System.out.println("Vehicle is driving");
	}
}

public class SingleLevel extends Vehicle {
	public void Car() {
		System.out.println("Car is driving");
	}

	public static void main(String[] args) {

		SingleLevel obj = new SingleLevel();
		obj.drive();
		obj.Car();
	}
}
