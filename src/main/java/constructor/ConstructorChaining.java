package constructor;

// This is example of constructor chaining using this() keyword within the same class.
public class ConstructorChaining {

	public ConstructorChaining() {
		
		this("Talib"); // // Calls the parameterized constructor with the argument "Talib"
		System.out.println("This is default constructor");
	}

	public ConstructorChaining(String str) {
		System.out.println("This is parametrized constructor and passed string is : " + str);
	}

	public static void main(String[] args) {

		ConstructorChaining obj = new ConstructorChaining();
	}
}
