/* 	S_Ready state class, it captures the Ready state and invokes
	OutputProcessor Op for any actions.
*/

class S_Ready extends VM_States {
	public void withdraw() {
		op.makewithdrawal();
	}

	public void balance() {
		op.displaybalance();
	}

	public void lock_failed() {
		op.displayincorrectpin();
	}

	public void deposit() {
		op.makedeposit();
	}

}