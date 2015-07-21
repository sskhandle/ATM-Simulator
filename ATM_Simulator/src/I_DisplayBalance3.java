// Inherits I_DisplayBalance to display balance for ATM_3

class I_DisplayBalance3 extends I_DisplayBalance
{
	public void displaybalance() {
		AbstractFactory object = new ATM3Factory();
		int balance = object.get_bal3();
		System.out.println("Balance : " + balance);
	}
}