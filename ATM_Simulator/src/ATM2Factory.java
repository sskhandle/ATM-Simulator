// Provides Output Actions for ATM_2

class ATM2Factory extends AbstractFactory {
	static String pin, id;
	static float bal;

	public void set_pin2(String a) {
		pin = a;
	}

	public void set_id2(String b) {
		id = b;
	}

	public void set_bal2(float c) {
		bal = c;
	}

	public String get_pin2() {
		return pin;
	}

	public String get_id2() {
		return id;
	}

	public float get_bal2() {
		return bal;
	}
}