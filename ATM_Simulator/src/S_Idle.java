/* 	S_Idle state class, it captures the Idle state and invokes
	OutputProcessor Op for any actions.
*/

class S_Idle extends VM_States {
	public void login_failed() {
		op.displayincorrectid();
	}

	public void login() {
		op.showenterpin();
	}

}