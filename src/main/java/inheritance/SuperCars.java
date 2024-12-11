package inheritance;
// This is the exampl of multi Hierarchal inheritance and hybrid inheritance.
// Vehicless is the parent or super class and other are subclass or child class.
class Vehicless {

	int maxSpeed;
	String brand;

	public void driveVehicle() {

		System.out.println("Vehicle is driving");
	}
}

class Cars extends Vehicless {

	public void driveCar() {
		System.out.println("Car is driving");
	}

}

class sportsCar extends Vehicless{
	public void driveSportCar() {
		System.out.println("Sport car is driving");
	}
}

public class SuperCars   extends Cars{

	public void driveSuperCar() {

		System.out.println("Super car is driving");
	}

	public static void main(String[] args) {

		
		sportsCar obj = new sportsCar();
		
		obj.driveVehicle();
		obj.driveSportCar();
		
		SuperCars ob = new SuperCars();
		ob.driveVehicle();
		ob.driveCar();
		
	}
}
