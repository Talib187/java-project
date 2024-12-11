package abstraction;

 abstract class laptop {

	public void getProcessor() {

		System.out.println("This part handles processing");
	}

	abstract void getBattery();

	abstract void getPrice();

}

  class AsusLaptop extends laptop {

	@Override
	void getBattery() {
		System.out.println("Battery OK");
	}

	@Override
	void getPrice() {
		System.out.println("Price OK");
	}

}

public class abstraction2 {

	public static void main(String[] args) {

		AsusLaptop obj = new AsusLaptop();
		obj.getBattery();
		obj.getPrice();
		obj.getProcessor();
	}
}
