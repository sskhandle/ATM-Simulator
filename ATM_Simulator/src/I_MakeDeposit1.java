class I_MakeDeposit1 extends I_MakeDeposit { // for ATM_1 and ATM_3
	public void makedeposit() {
		AbstractFactory deposit_amt = new Temp();
		int tempamt = deposit_amt.gettacc1depamt();
		int tempamt3 = deposit_amt.gettacc3depamt();  // get deposit amount

		AbstractFactory present_bal1 = new ATM1Factory();
		AbstractFactory present_bal3 = new ATM3Factory();

		int balance_1 = present_bal1.get_bal(); // get existing balance
		int total_amt1 = tempamt + balance_1;
		present_bal1.set_bal(total_amt1); // set new balance

		int balance_3 = present_bal3.get_bal3(); // get existing balance
		int total_amt3 = tempamt3 + balance_3;
		present_bal3.set_bal(total_amt3); // set new balance

	}
}