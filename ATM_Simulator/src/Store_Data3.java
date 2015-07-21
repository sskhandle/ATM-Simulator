class Store_Data3 extends Store_Data {
	public void storedata() {
		AbstractFactory tempobj = new Temp();
		int a = tempobj.gettacc3pin();
		int b = tempobj.gettacc3id();
		int c = tempobj.gettacc3bal();
		AbstractFactory data1obj = new ATM3Factory();
		data1obj.setpin3(a);
		data1obj.setid3(b);
		data1obj.setbal3(c);
	}
}