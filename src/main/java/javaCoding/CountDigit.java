package javaCoding;

import java.util.Scanner;

public class CountDigit {

	public  static int  getCount(int num) {
		
		int count = 0;
		num = Math.abs(num); // this will change the number to positve if it is negative number 
		while(num>0) {
			
			num = num/10;
			
			count++;
		}
	
		return count;
	}
	public static void main(String[] args) {
		
		System.out.println("Please enter a string");
		Scanner sc = new Scanner(System.in);
		int num  = sc.nextInt();
		
		System.out.println("Number of digit in the entered number is:");
		
		System.out.println(getCount(num));
	}
}
