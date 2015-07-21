class I_MakeDeposit2 extends I_MakeDeposit { // for acc2
	public void makedeposit() {
		AbstractFactory deposit_amt = new Temp();
		float temp_amt = deposit_amt.gettacc2depamt(); // get deposit amount
		AbstractFactory present_bal = new ATM2Factory();
		float balance = present_bal.get_bal2(); // get existing balance
		float total_amt = temp_amt + balance;
		present_bal.set_bal2(total_amt); // set new balance
	}
}