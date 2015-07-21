// Inherits I_DisplayMenu to display menu for ATM_1

public class I_DisplayMenu1 extends I_DisplayMenu {
	public void displaymenu() {
		System.out.println("---- ATM 1 Transaction Menu ----:"); // In small letters for ATM_1
		System.out.println("deposit");
		System.out.println("withdrawal");
		System.out.println("balance");
		System.out.println("lock");
		System.out.println("unlock");
	}
}
