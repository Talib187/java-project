package constructor;

class Example {

	public Example() {

		this(10);
		System.out.println("Super (Example ) class default constructor");
	}

	public Example(int a) {

		System.out.println("Super (Example ) class parametrized constructor");
	}
}

class newExample extends Example {

	public newExample() {

		this("Talib");
		System.out.println("Sub (newExample ) class default constructor");
	}

	public newExample(String str) {

		super(); // If there are multiple constructor in the superclass then super() keyword will call the default constructor.
		System.out.println("Sub (newExample ) class parametrized constructor"); 
	}
}

public class ConstChainUsingSuperAndThis {

	public static void main(String[] args) {
		newExample obj = new newExample();

	}
}
