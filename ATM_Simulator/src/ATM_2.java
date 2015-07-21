// ATM2 Input Processor, gateway to the system. Also takes care of initializing the components.

import java.io.*;

class ATM_2 {
	public void initialize() {
		try {
			MDA_EFSM m = new MDA_EFSM();
			BufferedReader b = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("ATM 2 ==> Set ID: ");
			String p_id = b.readLine();
			System.out.println("ATM 2 ==> Set PIN:");
			String p_pin = b.readLine();
			System.out.println("ATM 2 ==> Enter initial balance: ");
			String p_bal = b.readLine();
			float balance = Float.valueOf(p_bal.trim()).floatValue();
			AbstractFactory abs = new Temp();
			abs.set_acc(2);
			abs.settacc2id(p_id);
			abs.settacc2bal(balance);
			abs.settacc2pin(p_pin);
			m.create();
			String input = null;
			String id;
			String pin;
			int i;
			while (true) {

				System.out
						.println("Select your operation:  \n 1:LOGIN \n 2:PIN \n 3:Deposit \n 4:Balance \n 5:Withdraw \n 6:LOGOUT  \n Please enter your choice: ");

				input = b.readLine();
				i = Integer.parseInt(input);
				switch (i) {
				case 1:
					System.out.println("Enter valid ID");
					id = b.readLine();
					AbstractFactory data1obj = new ATM2Factory();
					String tempid = data1obj.get_id2();
					if (id.equals(tempid)) {
						m.login();
					} else {
						m.invalidlogin();
					}
					break;
				case 2: 											// pin
					int max = 2;
					System.out.println("Enter valid PIN");
					pin = b.readLine();
					AbstractFactory data1obj5 = new ATM2Factory();
					String temp = data1obj5.get_pin2();
					while (max > 0) {
						if (!(pin.equals(temp))) {
							m.incorrectpin();
							System.out
									.println("Invalid PIN. Enter correct PIN");
							pin = b.readLine();
						}
						--max; 
					}
					if (max <= 0) {
						if (!(pin.equals(temp))) {
							m.incorrectpinmaxattempts();
						}
					}
					if (pin.equals(temp)) {
						m.correctpin();
						float baltemp = data1obj5.get_bal2();
						if (baltemp <= 0) {
							m.belowminbal();
						} else {
							m.aboveminbal();
						}
					}
					break;
					
				case 3: 											// deposit
					System.out.println("Enter the Deposit Amount ");
					String depo = b.readLine();
					float depositamount = Float.valueOf(depo.trim())
							.floatValue();
					AbstractFactory deposittempobj = new Temp();
					deposittempobj.settacc2depamt(depositamount);
					m.deposit();
					AbstractFactory data1obj4 = new ATM2Factory();
					float temptt = data1obj4.get_bal2();
					if (temptt <= 0) {
						m.belowminbal();
					} else {
						m.aboveminbal();
					}
					break;
					
				case 4: 											// balance
					m.balance();
					break;

				case 5: 											// withdraw
					System.out.println("Enter Withdraw Amount");
					String withd = b.readLine();
					float withdrawamtamount = Float.valueOf(withd.trim())
							.floatValue();
					AbstractFactory wobj = new Temp();
					wobj.setacc2withdrawamt(withdrawamtamount);
					AbstractFactory data1obj3 = new ATM2Factory();
					float prebal = data1obj3.get_bal2();
					if (prebal >= withdrawamtamount) {
						m.withdraw();
					}
					float tempbalance = data1obj3.get_bal2();
					if (tempbalance <= 0) {
						m.belowminbal();
					} else {
						m.aboveminbal();
					}
					break;

				case 6: 											// logout
					m.logout();
					break;

				default:
					System.out.println("Incorrect Choice");
				}
			}
		} catch (Exception e) {
		}
	}
}