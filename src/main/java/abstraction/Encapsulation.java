package abstraction;

public class Encapsulation {

	private int myValue = 89;

	public int getMyValue() { // To get the value 
		return myValue;

	}
	
	public void setMyValue(int newValue) { // to set the value.
		
		this.myValue = newValue;
		
		System.out.println("New Value is: "+newValue);
	}

	public static void main(String[] args) {

		Encapsulation obj = new Encapsulation();
		
		obj.setMyValue(5);
	}
}