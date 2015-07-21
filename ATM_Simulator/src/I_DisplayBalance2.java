// Inherits I_DisplayBalance to display balance for ATM_2

class I_DisplayBalance2 extends I_DisplayBalance
{
	public void displaybalance() {
		AbstractFactory object = new ATM2Factory();
		float balance = object.get_bal2();
		System.out.println("Balance : " + balance);
	}
}