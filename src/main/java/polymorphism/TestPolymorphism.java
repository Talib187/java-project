package polymorphism;

class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    // Method overriding
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.makeSound(); // Calls the overridden method in Dog
    }
}


/*
 * This demonstrates the concept of polymorphism in Java. Even though both
 * objects have a getTax method, the behavior of the method is different
 * depending on the type of the object that is being used.
 * 
 * The obj object calls the getTax method of the TaxCalculator class, which
 * overrides the method of the Tax class. The obj1 object, on the other hand,
 * calls the getTax method of the Tax class directly.
 */