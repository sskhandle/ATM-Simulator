/* This project is runnable using Eclipse Juno.
 * This is the main class. This class executes the centralized ATM interface.
 */


import java.io.*;
class Create
{
public static void main(String args[])
{
try{
System.out.println("Select ATM: \n 1: ATM 1 \n 2: ATM 2 \n 3: ATM 3 \n Enter Your Choice: ");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int choice=Integer.parseInt(br.readLine());
switch (choice)
{
case 1: 
System.out.println("ATM 1"); 
ATM_1 atm_1=new ATM_1(); 
atm_1.initialize();
break;
case 2: 
System.out.println("ATM 2"); 
ATM_2 atm_2=new ATM_2(); 
atm_2.initialize();
break;
case 3: 
System.out.println("ATM 3"); 
ATM_3 atm_3=new ATM_3(); 
atm_3.initialize();
break;
    
default: System.out.println("Wrong Choice");
}
}
catch(Exception e){}
}
}