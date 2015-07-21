class Temp extends AbstractFactory {
	static int temp_intpin, temp_intpin3;
	static int temp_intid, temp_intid3;
	static int temp_intbal, temp_intbal3;

	static String temp_strpin;
	static String temp_strid;
	static float temp_flbal;

	static int temp_intdeposit, temp_intdeposit3;
	static float temp_fldeposit;
	static int withdrawamt, withdrawamt3;
	static float flwamt;
	static int account = 0;

	public void setacc1withdrawamt(int y) {
		withdrawamt = y;
	}

	public int getacc1withdrawamt() {
		return withdrawamt;
	}

	public void setacc3withdrawamt(int y) {
		withdrawamt3 = y;
	}

	public int getacc3withdrawamt() {
		return withdrawamt3;
	}

	public void setacc2withdrawamt(float y) {
		flwamt = y;
	}

	public float getacc2withdrawamt() {
		return flwamt;
	}

	public void settacc1depamnt(int x) {
		temp_intdeposit = x;
	}

	public int gettacc1depamt() {
		return temp_intdeposit;
	}

	public void settacc3depamnt(int x) {
		temp_intdeposit3 = x;
	}

	public int gettacc3depamt() {
		return temp_intdeposit3;
	}

	public void settacc2depamt(float x) {
		temp_fldeposit = x;
	}

	public float gettacc2depamt() {
		return temp_fldeposit;
	}

	public void set_pin1(int a) {
		temp_intpin = a;
	}

	public void set_id1(int b) {
		temp_intid = b;
	}

	public void set_bal1(int c) {
		temp_intbal = c;
	}

	public void set_acc(int d) {
		account = d;
	}

	public int get_acc() {
		return account;
	}

	public int get_pin1() {
		return temp_intpin;
	}

	public int get_id1() {
		return temp_intid;
	}

	public int get_bal1() {
		return temp_intbal;
	}

	public void settacc2pin(String a) {
		temp_strpin = a;
	}

	public void settacc2id(String b) {
		temp_strid = b;
	}

	public void settacc2bal(float c) {
		temp_flbal = c;
	}

	public String gettacc2pin() {
		return temp_strpin;
	}

	public String gettacc2id() {
		return temp_strid;
	}

	public float gettacc2bal() {
		return temp_flbal;
	}

	public void set_pin3(int a) {
		temp_intpin3 = a;
	}

	public void set_id3(int b) {
		temp_intid3 = b;
	}

	public void set_bal3(int c) {
		temp_intbal3 = c;
	}

	public int gettacc3pin() {
		return temp_intpin3;
	}

	public int gettacc3id() {
		return temp_intid3;
	}

	public int gettacc3bal() {
		return temp_intbal3;
	}

}