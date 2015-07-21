// Inherits I_DisplayMenu to display menu for ATM_2

public class I_DisplayMenu2 extends I_DisplayMenu {
	public void displaymenu() {
		System.out.println("---- ATM 2 Transaction Menu: ----"); // In capital letters for ATM_2
		System.out.println("DEPOSIT");
		System.out.println("WITHDRAWAL");
		System.out.println("BALANCE");
		System.out.println("LOCK");
		System.out.println("UNLOCK");
	}
}
