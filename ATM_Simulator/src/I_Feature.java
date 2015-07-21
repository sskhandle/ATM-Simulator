abstract class I_Feature {
	public abstract Store_Data get_storedata();

	public abstract I_DisplayBalance get_displaybalance();

	public abstract I_MakeDeposit get_makedeposit();

	public abstract I_MakeWithdraw get_makewithdrawal();

	public abstract I_DisplayMenu get_displaymenu();

}