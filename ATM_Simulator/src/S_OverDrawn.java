/* 	S_OverDrawn state class, it captures the Overdraw state and invokes
	OutputProcessor Op for any actions.
*/

class S_OverDrawn extends VM_States {
	public void withdraw() {
		op.displaybalbelowmin();
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