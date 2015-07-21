class I_MakeWithdraw2 extends I_MakeWithdraw { // for acc2
	public void makewithdrawal() {
		AbstractFactory abs1 = new Temp();
		float withdrawamt = abs1.getacc2withdrawamt(); // get withdrawal amount
		AbstractFactory abs2 = new ATM2Factory();
		float bal = abs2.get_bal2(); // get existing balance
		float total = bal - withdrawamt; // calculate new balance
		abs2.set_bal2(total); // set new balance
	}

}