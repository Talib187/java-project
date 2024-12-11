package inheritance;
// This is the example of multi level inheritance.
class Vehicle {

	int maxSpeed;
	String brand;

	public void drive() {
		System.out.println("Vehicle is driving");
	}
}

class Car extends Vehicle{

	public void driveCar() {

		System.out.println("Car is driving");
	}
}

public class SportCar  extends Car{

	public void driveSportCar() {

		System.out.println("Sport car is driving");
	}

	public static void main(String[] args) {

		SportCar obj = new SportCar();
		obj.drive();
		obj.driveCar();
		obj.driveSportCar();
		
	}
}
