package constructor;

public class ConstructorOverloading {

	public ConstructorOverloading(int a, String b) {

		System.out.println("You have pssed int: " + a);
		System.out.println("You have pssed String: " + b);

	}

	public ConstructorOverloading() {

		System.out.println("This is just default constructor");
	}

	public static void main(String[] args) {

		ConstructorOverloading obj = new ConstructorOverloading(23, "Talib");

		ConstructorOverloading obj1 = new ConstructorOverloading();
	}
}

// This is the example of the constructor overloading both of the method is of the same name and 
// and being called by creating object in the main method.
