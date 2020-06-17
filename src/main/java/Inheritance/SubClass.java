package Inheritance;

public class SubClass extends SuperClass{

	
	public void multiplication(int a, int b) {
		int c = a * b;
		System.out.println("Multiplication of given numbers is: " + c);
		
	}
	
	public static void main(String[] args) {
		
		SubClass sub = new SubClass();
		
		sub.addition(10, 20);
		sub.subtraction(100, 50);
		sub.multiplication(5, 5);
		
	}
}
