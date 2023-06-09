package Com.Practice;
import java.util.*;
class Customer{
	double amount=10000;
	double withdraw;
	synchronized void  withdraw() {
		System.out.println("Going TO Withdraw...");
		System.out.println("Enter Amount TO Withdraw :");
		Scanner sc = new Scanner(System.in);
		withdraw = sc.nextDouble();
		check();
	}
	
	void check() {
		if(amount<withdraw) {
			System.out.println("Less balance ! \n waiting for deposit...");
			System.out.println("Availabel Balance = "+amount);
			try {
				wait();
				deposit();	
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		show();
	}
	
	
	
	private void show() {	
		amount = amount-withdraw;
		System.out.println("Withdraw completed...! \n   Availabel Amount : "+amount);		
	}
	

	synchronized void deposit() {
		System.out.println("Enter Amount to Deposit :");
		Scanner s = new Scanner(System.in);
		double deamount = s.nextDouble();
		System.out.println("going to deposit...");
		amount = deamount+amount;
		System.out.println("Deposit Completetd...");
		System.out.println("Now Availabel Balance : "+amount);
		check();
		notify();
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw();
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit();
			}
		}.start();
		
	}

}
