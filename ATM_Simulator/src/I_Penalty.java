class I_Penalty extends VM_States {
	public void belowminbalwithpenalty() {
		op.imposepenalty(); 				// Impose penalty if the min balnce goes below 
											// the set value for ATM_1
	}
}