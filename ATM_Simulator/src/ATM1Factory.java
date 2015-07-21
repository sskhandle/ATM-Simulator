// Provides Output Actions for ATM_1

class ATM1Factory extends AbstractFactory {
	static int pin, id;
	static int bal;

	public void set_pin(int a) {
		pin = a;
	}

	public void set_id(int b) {
		id = b;
	}

	public void set_bal(int c) {
		bal = c;
	}

	public int get_pin() {
		return pin;
	}

	public int get_id() {
		return id;
	}

	public int get_bal() {
		return bal;
	}
}