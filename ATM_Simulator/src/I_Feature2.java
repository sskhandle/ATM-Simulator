class I_Feature2 extends I_Feature {
	// all the functions return respective object
	public Store_Data get_storedata() {
		Store_Data s_d = new Store_Data2();
		return s_d;
	}

	public I_DisplayBalance get_displaybalance() {
		I_DisplayBalance d_bal = new I_DisplayBalance2();  // Displays the existing balance
		return d_bal;
	}

	public I_MakeDeposit get_makedeposit() {
		I_MakeDeposit m_dep = new I_MakeDeposit2();  // Enables making a deposit
		return m_dep;
	}

	public I_MakeWithdraw get_makewithdrawal() {
		I_MakeWithdraw m_wd = new I_MakeWithdraw2();  // Enables making a withdrawal
		return m_wd;
	}

	public I_DisplayMenu get_displaymenu() {
		I_DisplayMenu menu = new I_DisplayMenu2();  // Displays the menu
		return menu;
	}
}