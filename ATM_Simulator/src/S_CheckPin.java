/* 	S_CheckPin state class, it captures the Check Pin state and invokes
	OutputProcessor Op for any actions.
*/


class S_CheckPin extends VM_States {

	public void correctpin() {
		op.displaymenu(); // show the menu options
	}

	public void incorrectpinmaxattempts() {
		op.displaytoomanyattempts(); // exceeded maximum attempts
	}

	public void pin_failed() {
		op.displayincorrectpin();
	}

}