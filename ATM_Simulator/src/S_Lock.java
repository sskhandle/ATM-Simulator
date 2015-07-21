/* 	S_Lock state class, it captures the Lock state and invokes
	OutputProcessor Op for any actions.
*/

class S_Lock extends VM_States {
	public void unlock_failed() {
		op.displayincorrectpin();
	}
}