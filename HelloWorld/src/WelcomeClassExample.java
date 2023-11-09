










import java.util.Scanner;

public class WelcomeClassExample {

	public static void main(String[] args) {
//		System.out.print("Hello Gagan!!!");
//				Scanner myObj = new Scanner(System.in);
//		System.out.println("Enter username");
//		String A = myObj.nextLine();
//		System.out.println("Username is: "+A);
//		int a=myObj.nextInt();
		int n;
do {
	 System.out.println("_____________________________________________________________________________");
		System.out.print(" \n 1. Counting \n 2. Reverse counting from 25 to 1 \n "
				+ "3. list of even number from 1 to 100 \n 4. factorial of given number "
				+ "\n 5. table of given number \n 6. Exit \n Enter Your Choice : ");
		Scanner s=new Scanner(System.in);
		 n=s.nextInt();
		 System.out.println("_____________________________________________________________________________");
		if(n==1){
		System.out.println("     Counting Numbers \n Enter Start no : ");
		int a = s.nextInt();
		System.out.println("Enter End no : ");
		int b=s.nextInt();
		while(a!=b+1) {
			System.out.println(" "+a);
			a++;
		}
		}
		else if(n==2){
			System.out.println(" Reverse Counting");
			for(int i =25;i>=1;i--) {
				System.out.println(" "+i);
			}
			
		}
		else if(n==3) {
			System.out.println("   Even Number Between 1 to 100 ");
			for(int i=0;i<=100;i++) {
				if(i%2==0) {
					System.out.print(" "+i);
				}
			}
		}
		else if(n==4) {
			System.out.println(" Factroial of given Number ");
			System.out.print(" Enter Number ");
			int f=s.nextInt();
			int fact = 1;
			for(int i=1;i<=f;i++) {
				fact=fact*i;
			}
			System.out.println(" Factroial ="+fact);
		}
		else if(n==5) {
			System.out.println(" Table pf given Number ");
			System.out.print("Enter any number : ");
			int k =s.nextInt();
			for(int i=0;i<=10;i++) {
				System.out.println("  "+k+"X"+i+"="+k*i);
			}
		}
		else if(n==6) {
			System.out.println("  \n     Thank You... ");
			System.exit(0);
		}
		else{
		System.out.println("You entered wrong input !!!");
		}		
	}while(n!=6);
	}
}
