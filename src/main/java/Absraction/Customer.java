package Absraction;

public class Customer extends Bank{

	@Override
	void balance() {
	System.out.println("Balance is $5000");
	}

	@Override
	void amountToTransfer() {
		System.out.println("Amont to be transferred is $2000");
	}

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.balance();
		c.amountToTransfer();
		c.transrfer();
	}
	
}
