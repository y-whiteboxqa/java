package Polymorphism;


// Constructor overloading

public class Employee {

	int id;
	String name;
	int salary;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;

	}

	Employee(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "John");
		Employee e2 = new Employee(2, "Peter", 5000);
		e1.display();
		e2.display();
	}
	
}
