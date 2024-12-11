package abstraction;

interface laptop1 {
	public void getProcessor();

	public void getBattery();

	public void getPrice();
}

class AsusLaptop1 implements laptop1 {

	public void getProcessor() {
		System.out.println("This part handles processing");

	}

	public void getBattery() {
		System.out.println("Battery OK");

	}

	public void getPrice() {
		System.out.println("Battery OK");

	}

}

public class interface1 {

	public static void main(String[] args) {

		AsusLaptop obj = new AsusLaptop();
		obj.getBattery();
		obj.getPrice();
		obj.getProcessor();
	}
}
