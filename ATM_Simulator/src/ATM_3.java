// ATM3 Input Processor, gateway to the system. Also takes care of initializing the components.

import java.io.*;


class ATM_3 {
	public void initialize() {
		try {
			MDA_EFSM m = new MDA_EFSM();
			BufferedReader b = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("ATM 3 ==> Set ID: ");
			int p_id = Integer.parseInt(b.readLine());
			System.out.println("ATM 3 ==> Set PIN: ");
			int p_pin = Integer.parseInt(b.readLine());
			System.out.println("ATM 3 ==> Enter initial balance: ");
			int p_bal = Integer.parseInt(b.readLine());
			AbstractFactory abs = new Temp();
			abs.set_id3(p_id);
			abs.set_pin3(p_pin);
			abs.set_bal3(p_bal);
			abs.set_acc(3);
			m.create();
			String input = null;
			int id, pin;
			int temp, ch;
			while (true) {
				System.out.println("Select your operation:  \n 1:LOGIN \n 2:PIN \n 3:Deposit \n 4:Balance \n 5:Withdraw \n 6:LOGOUT \n 7:Lock \n 8:Unlock  \n Please enter your choice: ");

				input = b.readLine();
				ch = Integer.parseInt(input);
				switch (ch) {
				case 1: 											// login
					System.out.println("Enter valid ID");
					id = Integer.parseInt(b.readLine());
					AbstractFactory d3 = new ATM3Factory();
					temp = d3.get_id3();
					if (id != temp) {
						m.invalidlogin();
					} else {
						m.login();
					}
					break;
					
				case 2: 											// pin
					System.out.println("Enter valid PIN");
					pin = Integer.parseInt(b.readLine());
					AbstractFactory d1ob5 = new ATM3Factory();
					temp = d1ob5.get_pin3();
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
						temp = d1ob5.get_bal3();
						if (temp <= 100) {
							m.belowminbal();
						} else {
							m.aboveminbal();
						}
					}
					break;
					
				case 3: 												// deposit
					System.out.println("Enter the Amount to Deposit ");
					int depamt = Integer.parseInt(b.readLine());
					AbstractFactory deptmpob = new Temp();
					deptmpob.settacc3depamnt(depamt);
					m.deposit();
					AbstractFactory d1ob4 = new ATM3Factory();
					temp = d1ob4.get_bal3();
					if (temp <= 100) {
						m.belowminbal();
					} else {
						m.aboveminbal();
					}
					break;
					
				case 4: 												// balance
					m.balance();
					break;
					
				case 5: 												// withdraw
					System.out.println("Enter the Amount to Withdraw ");
					int withdrawamt = Integer.parseInt(b.readLine());
					AbstractFactory wobj = new Temp();
					wobj.setacc3withdrawamt(withdrawamt);
					AbstractFactory data1obj3 = new ATM3Factory();
					int prebal = data1obj3.get_bal3();
					if (prebal >= (withdrawamt)) 
					{
						m.withdraw();
					}
					temp = data1obj3.get_bal3();
					if (temp <= 100) {
						m.belowminbalwithpenalty(); 					// penalty since balance is
																		// less than min
					} else {
						m.aboveminbal();
					}
					break;


				case 6: 												// logout
					m.logout();
					break;
					
				case 7: 												// lock
					 System.out.println("enter pin");
					 pin=Integer.parseInt(b.readLine());
					 AbstractFactory d1ob2 = new ATM3Factory();
					 temp=d1ob2.get_pin3();
					 if(pin==temp)
					 {
					m.lock();
					 }
					 else
					 {
					 m.incorrectlock();
					 }
					break;
				case 8: 												// unlock
					System.out.println("Enter valid PIN");
					pin = Integer.parseInt(b.readLine());
					AbstractFactory d1ob12 = new ATM3Factory();
					temp = d1ob12.get_pin3();
					if (pin == temp) {
						m.unlock();
						temp = d1ob12.get_bal3();
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