class I_MakeWithdraw1 extends I_MakeWithdraw { // for acc1
	public void makewithdrawal() {
		AbstractFactory abs1 = new Temp();

		int withdraw_amt1 = abs1.getacc1withdrawamt(); // get withdrawal amount

		AbstractFactory abs2 = new ATM1Factory();
		int bal = abs2.get_bal(); // get existing balance

		int total_2 = bal - withdraw_amt1; // calculate new balance

		abs2.set_bal(total_2); // set new balance

		int withdraw_amt3 = abs1.getacc3withdrawamt(); // get withdrawal amount

		AbstractFactory abs3 = new ATM3Factory();
		int bal_3 = abs3.get_bal3(); // get existing balance

		int total_3 = bal_3 - withdraw_amt3; // calculate new balance
		abs3.setbal3(total_3); // set new balance

	}
}