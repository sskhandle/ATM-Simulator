// ATM1 Input Processor, gateway to the system. Also takes care of initializing the components.

import java.io.*;

class ATM_1 {
	public void initialize() {
		try {
			MDA_EFSM m = new MDA_EFSM();
			BufferedReader b = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("ATM 1 ==> Set ID: ");
			int p_id = Integer.parseInt(b.readLine());
			System.out.println("ATM 1 ==> Set PIN: ");
			int p_pin = Integer.parseInt(b.readLine());
			System.out.println("ATM 1 ==> Enter initial balance: ");
			int p_bal = Integer.parseInt(b.readLine());
			AbstractFactory abs = new Temp();
			abs.set_id1(p_id);
			abs.set_pin1(p_pin);
			abs.set_bal1(p_bal);
			abs.set_acc(1);
			m.create();
			String input = null;
			int id, pin;
			int temp, ch;
			while (true) {
				System.out.println("Select your operation:  \n 1:LOGIN \n 2:PIN \n 3:Deposit \n 4:Balance \n 5:Withdraw \n 6:LOGOUT \n 7:Lock \n 8:Unlock  \n Please enter your choice: ");

				input = b.readLine();
				ch = Integer.parseInt(input);
				switch (ch) {
				case 1: // login
					System.out.println("Enter valid ID");
					id = Integer.parseInt(b.readLine());
					AbstractFactory d1 = new ATM1Factory();
					temp = d1.get_id();
					if (id != temp) {
						m.invalidlogin();
					} else {
						m.login();
					}
					break;
				case 3: // deposit
					System.out.println("Enter the Deposit Amount ");
					int depamt = Integer.parseInt(b.readLine());
					AbstractFactory deptmpob = new Temp();
					deptmpob.settacc1depamnt(depamt);
					m.deposit();
					AbstractFactory d1ob4 = new ATM1Factory();
					temp = d1ob4.get_bal();
					if (temp <= 100) {
						m.belowminbal();
					} else {
						m.aboveminbal();
					}
					break;
				case 5: 														// Withdraw
					System.out.println("Enter Withdraw Amount");
					int withdrawamt = Integer.parseInt(b.readLine());
					AbstractFactory wobj = new Temp();
					wobj.setacc1withdrawamt(withdrawamt);
					AbstractFactory data1obj3 = new ATM1Factory();
					int prebal = data1obj3.get_bal();
					if (prebal >= (withdrawamt)) 								
																				
					{
						m.withdraw();
					}
					temp = data1obj3.get_bal();
					if (temp <= 100) {
						m.belowminbalwithpenalty(); 							// Penalty imposed since balance is
																				// less than min
					} else {
						m.aboveminbal();
					}
					break;
				case 4: 														// Balance
					m.balance();
					break;
				case 2: 														// Pin
					System.out.println("Enter valid PIN");
					pin = Integer.parseInt(b.readLine());
					AbstractFactory d1ob5 = new ATM1Factory();
					temp = d1ob5.get_pin();
					int maxval = 1;
					while (maxval > 0) {
						if (pin != temp) {
							m.incorrectpin();
							System.out.println("Please enter the correct pin");
							pin = Integer.parseInt(b.readLine());
						}
						--maxval;
					}
					if (maxval <= 0) {
						if (pin != temp) {
							m.incorrectpinmaxattempts();
						}
					}
					if (pin == temp) {
						m.correctpin();
						temp = d1ob5.get_bal();
						if (temp <= 100) {
							m.belowminbal();
						} else {
							m.aboveminbal();
						}
					}
					break;

				case 6: 															// Logout
					m.logout();
					break;

				case 7: 															// Lock
					System.out.println("Enter valid PIN");
					pin = Integer.parseInt(b.readLine());
					AbstractFactory d1ob2 = new ATM1Factory();
					temp = d1ob2.get_pin();
					if (pin == temp) {
						m.lock();
					} else {
						m.incorrectlock();
					}
					break;
				case 8: 															// Unlock
					System.out.println("Enter valid PIN");
					pin = Integer.parseInt(b.readLine());
					AbstractFactory d1ob12 = new ATM1Factory();
					temp = d1ob12.get_pin();
					if (pin == temp) {
						m.unlock();
						temp = d1ob12.get_bal();
						if (temp <= 100) {
							m.belowminbal();
						} else {
							m.aboveminbal();
						}
					} else {
						m.incorrectunlock();
					}
					break;

				default:
					System.out.println("Incorrect Choice");
				}
			}
		} catch (Exception e) {
		}

	}
}