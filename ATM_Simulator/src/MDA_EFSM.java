/* The MDA_EFSM class. It is the class that captures the platform independent behaviors.
   and the various sub-state classes help it 
   The methods that take no parameters represents events in the MDA EFSM.
 */


import static java.lang.System.exit;

class MDA_EFSM {
	static int state = 00;
	VM_States idle = new S_Idle();			// with respect to the current state 
	VM_States cp = new S_CheckPin();		// the actions displayed
	VM_States ready = new S_Ready(); 		// in the menu are performed
	VM_States pen = new I_Penalty(); 		// according to the input request
	VM_States lock = new S_Lock();
	VM_States od = new S_OverDrawn();
	VM_States states = new VM_States();

	public void create() {
		state = 01;
		states.datastore();
	}

	public void login() {
		if (state == 01) {
			idle.login();
			state = 02;
		}
	}

	public void deposit() {
		if (state == 06) {
			od.deposit();
			state = 03;
		} else if (state == 04) {
			ready.deposit();
		}
	}

	public void balance() {
		if (state == 06) {
			od.balance();
		} else if (state == 04) {
			ready.balance();
		}
	}

	public void correctpin() {
		if (state == 02) {
			cp.correctpin();
			state = 03;
		}
	}

	public void aboveminbal() {
		if (state == 03) {
			state = 04;
		}
	}

	public void belowminbal() {
		if (state == 03) {
			state = 06;
		}
	}

	public void incorrectpin() {
		if (state == 02) {
			cp.pin_failed();
		}
	}

	public void invalidlogin() {
		if (state == 01) {
			idle.login_failed();
		}
	}

	public void incorrectpinmaxattempts() {
		if (state == 02) {
			cp.incorrectpinmaxattempts();
			state = 01;
		}
	}

	public void logout() {
		if (state == 02 || state == 04 || state == 06) // if in state of
														// checkpin, ready or
														// overdraw
		{
			state = 01;
			System.out.println("System is Logged Out");
			exit(1);
		}
	}

	public void withdraw() {
		if (state == 04) {
			ready.withdraw();
			state = 03;
		}
		if (state == 06) {
			od.withdraw();
		}
	}

	public void belowminbalwithpenalty() {
		if (state == 03) {
			pen.belowminbalwithpenalty();
			state = 06;
		}
	}

	public void lock() {
		if (state == 04 || state == 06) {
			state = 05;
		}
		System.out.println("Account Locked!! ");
	}

	public void incorrectlock() {
		if (state == 04) {
			ready.lock_failed();
		} else if (state == 06) {
			od.lock_failed();
		}
	}

	public void unlock() {
		if (state == 05) {
			System.out.println("Account Unocked!!");
			state = 03;
		}
	}

	public void incorrectunlock() {
		if (state == 05) {
			lock.unlock_failed();
		}
	}
}