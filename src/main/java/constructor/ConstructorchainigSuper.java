package constructor;

// Constructor chaining example using super() keyword;
class Animal {

	public Animal() {

		System.out.println("Constructor of Animal (Super class)");
	}
	
	public Animal(String str) {

		System.out.println("Constructor of Animal parametrized  (Super class)");
	}
}

class Cat extends Animal {

	public Cat() {
		super(); // This will call the constructor of the super class., if no argument is passed it will call the default constrcutor.
		System.out.println("Constructor of Cat class (Sub class)");
	}
}

public class ConstructorchainigSuper {

	public static void main(String[] args) {
		
		Cat obj = new Cat();

	}
}
