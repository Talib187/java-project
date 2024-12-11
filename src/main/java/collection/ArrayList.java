package collection;

public class ArrayList {

	public static void main(String[] args) {
		java.util.ArrayList<String> fruits = new java.util.ArrayList<String>();
		// add elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		// get(index): Accessing elements by index
		fruits.set(1, "Mango"); // ["Apple", "Mango", "Orange"]
		// remove(index): Removing an element by index
		fruits.remove(2); // // ["Apple", "Mango"]
		// size(): Getting the number of elements in arraylist
		int size = fruits.size(); // 2
		// isEmpty(): Checking if the ArrayList is empty
		boolean isEmpty = fruits.isEmpty(); // false
		// indexOf(element): Finding the index of an element
		int index = fruits.indexOf("Apple"); // 0
		// toArray(): converting the arraylist to array.
		Object[] fruitsArray = fruits.toArray(); // ["Apple", "Mango"]
	}
}
