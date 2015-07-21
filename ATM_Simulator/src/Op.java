/* Output Processor. Contains references to a particular family of output actions created
 * by a specified type of Factory. (ATM1Factory, ATM2Factory, ATM3Factory)
 * It invokes the respective OutputAction objects when respective methods are called.
*/


class Op {
	AbstractFactory temp = new Temp();
	I_Feature f1 = new I_Feature1(); 
	I_Feature f2 = new I_Feature2();
	I_Feature f3 = new I_Feature3();

	public void storedata() {

		Store_Data sd;
		int account_num = temp.get_acc();
		if (account_num == 1) {

			sd = f1.get_storedata();
			sd.storedata();
		} else if (account_num == 2) {
			sd = f2.get_storedata();
			sd.storedata();

		} else if (account_num == 3) {
			sd = f3.get_storedata();
			sd.storedata();

		}

	}

	public void displaymenu() {

		I_DisplayMenu menu;
		int accountnum = temp.get_acc();
		if (accountnum == 1) {

			menu = f1.get_displaymenu();
			menu.displaymenu();
		} else if (accountnum == 2) {
			menu = f2.get_displaymenu();
			menu.displaymenu();
		} else if (accountnum == 3) {
			menu = f3.get_displaymenu();
			menu.displaymenu();

		}

	}

	public void displayincorrectpin() {
		System.out.println("\t Incorrect Pin!!");
	}

	public void displaytoomanyattempts() {
		System.out
				.println("\t Too Many Incorrect Attempts, System is Logging Out");
	}

	public void displaybalbelowmin() {
		System.out.println("\t Balance is less than minimum!!");
	}

	public void displaybalance() {
		I_DisplayBalance d_bal;
		int accountnum3 = temp.get_acc();
		if (accountnum3 == 1) {
			d_bal = f1.get_displaybalance();
			d_bal.displaybalance();
		}
		if (accountnum3 == 2) {
			d_bal = f2.get_displaybalance();
			d_bal.displaybalance();
		}
		if (accountnum3 == 3) {
			d_bal = f3.get_displaybalance();
			d_bal.displaybalance();
		}

	}

	public void displayincorrectid() {
		System.out.println("\t Incorrect ID!!");
	}

	public void showenterpin() {
		System.out.println("\t Enter Valid Pin");
	}

	public void makewithdrawal() {
		I_MakeWithdraw m_wd;
		int accountnum5 = temp.get_acc();
		if (accountnum5 == 1) {
			m_wd = f1.get_makewithdrawal();
			m_wd.makewithdrawal();
		} else if (accountnum5 == 2) {
			m_wd = f2.get_makewithdrawal();
			m_wd.makewithdrawal();
		} else if (accountnum5 == 3) {
			m_wd = f3.get_makewithdrawal();
			m_wd.makewithdrawal();
		}

	}

	public void imposepenalty() {

		AbstractFactory atm1 = new ATM1Factory();
		int bal = atm1.get_bal();
		int total = bal - 5;
		atm1.set_bal(total);
	}

	public void makedeposit() {
		I_MakeDeposit m_dep;
		int accountnum4 = temp.get_acc();
		if (accountnum4 == 1) {
			m_dep = f1.get_makedeposit();
			m_dep.makedeposit();
		} else if (accountnum4 == 2) {
			m_dep = f2.get_makedeposit();
			m_dep.makedeposit();
		}

		else if (accountnum4 == 3) {
			m_dep = f3.get_makedeposit();
			m_dep.makedeposit();
		}

	}

}