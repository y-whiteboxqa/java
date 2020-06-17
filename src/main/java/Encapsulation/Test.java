package Encapsulation;

public class Test {

	public static void main(String[] args) {

		//create object of an encapsulated class
		EmployeeDetails e = new EmployeeDetails();
		e.setId(123);
		e.setName("John");
		System.out.println("Emloyee id is: " + e.getId());
		System.out.println("Employee name is: " + e.getName());

	}
}
