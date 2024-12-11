package constructor;

public class thisDotKeyword {

	int age = 10;
	
	public void getAge(int age) {
		
		this.age = age;
		System.out.println(age);
	}
	final static void main(String[] args) {
		
		thisDotKeyword obj = new thisDotKeyword();
		obj.getAge(20);
	}
}
