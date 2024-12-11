package staticUsage;

public class StaticVariable2 {

	static int totalCount = 0;
	
	String name;
	int age;
	
	public StaticVariable2(String name, int age) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.age = age;
		
		totalCount++;
		
	}

	public static void displayTotalCount() {
		
		System.out.println("Total number of students: "+totalCount);
	}
	
	public static void main(String[] args) {
		
		StaticVariable2 obj1 = new StaticVariable2("Talib", 20);
		
		StaticVariable2 obj2 = new StaticVariable2("Galib", 21);
		
		obj1.displayTotalCount();
		obj2.displayTotalCount();
		
		

		
	}
}
