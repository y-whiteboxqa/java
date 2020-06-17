package Absraction;

public abstract class Bank {
//you cannot instantiate abstract class
	
	
	abstract void balance();
	
	abstract void amountToTransfer();
	
	//non-abstract method
	void transrfer() {
		System.out.println("Amount Transferred");
	}
}
