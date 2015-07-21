// General state class. Each state behavior is captured as a subclass of this class.

class VM_States {
	Op op = new Op();

	public void datastore() {
		op.storedata();
	}

	public void open() {
	}

	public void login() {
	}

	public void logout() {
	}

	public void withdraw() {
	}

	public void belowminbalwithpenalty() {
	}

	public void deposit() {
	}

	public void balance() {
	}

	public void lock() {
	}

	public void lock_failed() {
	}

	public void unlock() {
	}

	public void unlock_failed() {
	}

	public void login_failed() {
	}

	public void belowminbal() {
	}

	public void incorrectpinmaxattempts() {
	}

	public void correctpin() {
	}

	public void aboveminbal() {
	}

	public void pin_failed() {
	}
}