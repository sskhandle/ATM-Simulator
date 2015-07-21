// Provides Output Actions for ATM_3

class ATM3Factory extends AbstractFactory {
	static int pin, id;
	static int bal;

	public void setpin3(int a) {
		pin = a;
	}

	public void setid3(int b) {
		id = b;
	}

	public void setbal3(int c) {
		bal = c;
	}

	public int get_pin3() {
		return pin;
	}

	public int get_id3() {
		return id;
	}

	public int get_bal3() {
		return bal;
	}
}
