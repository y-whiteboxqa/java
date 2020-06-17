package Polymorphism;

public class ChildClass extends ParentClass {

	@Override
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of numbers from child class is: " + sum);
	}
	
	public static void main(String[] args) {
		
		ParentClass p = new ParentClass();
		ParentClass c = new ChildClass();
//Overriding method is called when parent class reference refers to child class object		
		
		p.add(10, 20);
		c.add(40, 50);
	}
}
