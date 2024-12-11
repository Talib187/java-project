package collection;

public class LinkedList {
	public static void main(String[] args) {
		// Creating a LinkedList

		java.util.LinkedList<String> countries = new java.util.LinkedList<String>();

		// add(element): Adding elements to the LinkedList
		countries.add("USA"); // ["USA"]
		countries.add("Canada"); // ["USA", "Canada"]
		countries.add("UK"); // ["USA", "Canada", "UK"]
		// get(index): Accessing elements by index
		String firstCountry = countries.get(0); // "USA"
		// set(index, element): Replacing an element at a specific index
		countries.set(1, "Australia"); // ["USA", "Australia", "UK"]
		// remove(index): Removing an element by index
		countries.remove(2); // ["USA", "Australia"]
		// size(): Getting the number of elements in the LinkedList
		int size = countries.size(); // 2
		// isEmpty(): Checking if the LinkedList is empty
		boolean isEmpty = countries.isEmpty(); // false
		// clear(): Removing all elements from the LinkedList
		countries.clear(); // []
		// Printing the LinkedList
		System.out.println(countries); // []
		// Printing the variables
		System.out.println("First Country: " + firstCountry); // First Country: USA
		System.out.println("Size: " + size); // Size: 2
		System.out.println("Is Empty: " + isEmpty); // Is Empty: true
		// addFirst(element): Adding an element at the beginning of the LinkedList
		countries.addFirst("Germany"); // ["Germany"]
		countries.addFirst("France"); // ["France", "Germany"]
		// addLast(element): Adding an element at the end of the LinkedList
		countries.addLast("Spain"); // ["France", "Germany", "Spain"]
		// getFirst(): Accessing the first element of the LinkedList
		String first = countries.getFirst(); // "France"
		// getLast(): Accessing the last element of the LinkedList
		String last = countries.getLast(); // "Spain"
		// Printing the updated LinkedList
		System.out.println(countries); // ["France", "Germany", "Spain"]
		System.out.println("First: " + first); // First: France
		System.out.println("Last: " + last); // Last: Spain
	}
}
