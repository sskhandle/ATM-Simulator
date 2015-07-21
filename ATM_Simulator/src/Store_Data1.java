class Store_Data1 extends Store_Data {
	public void storedata() {
		AbstractFactory tempobj = new Temp();
		int a = tempobj.get_pin1();
		int b = tempobj.get_id1();
		int c = tempobj.get_bal1();
		AbstractFactory data1obj = new ATM1Factory();
		data1obj.set_pin(a);
		data1obj.set_id(b);
		data1obj.set_bal(c);
	}
}