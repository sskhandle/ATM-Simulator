// Inherits I_DisplayBalance to display balance for ATM_1

class I_DisplayBalance1 extends I_DisplayBalance
{
	public void displaybalance() {
		AbstractFactory object = new ATM1Factory();
		int balance = object.get_bal();
		System.out.println("Balance :  " + balance);
	}
}