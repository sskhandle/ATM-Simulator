class Store_Data2 extends Store_Data {
	public void storedata() {

		AbstractFactory tempobj = new Temp();
		String a = tempobj.gettacc2pin();
		String b = tempobj.gettacc2id();
		float c = tempobj.gettacc2bal();
		AbstractFactory data1obj = new ATM2Factory();
		data1obj.set_pin2(a);
		data1obj.set_id2(b);
		data1obj.set_bal2(c);
	}
}