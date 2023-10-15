



import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int b=0;
		do {
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
					+ "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\n\t0. Exit \n\t1. Check Palindrome Number \n\t2. Check Prime Number \n\t3. Fibonacci Series \n\t4. Check Palindrome String"
				+ "\n\t5. For Reverse String");
		System.out.print("\nEnter Your Choice : ");

		Scanner s1 = new Scanner(System.in);
		 b = s1.nextInt();
		 if(b==1)
		 {
		System.out.print("Enter any Number : ");
		int a = 0,temp,rev=0,rem;
	
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		temp = a;
		while(temp!=0) {
			rem = temp%10;
			rev= rev*10+rem;
			temp = temp/10;
		}
		if(a==rev)
		{
			System.out.println("Given No. is Palindrome NUmber");
		}
		else
		{
			System.out.println("Given Number is not a Palindrome Number ");
		}
	}
		 else if(b==2)
		 {
			 int c=0,temp=0,i,d;
			 System.out.println("\n\t  Checking Prime Number ");
			 System.out.print("\n		Enter any Number : ");
			 Scanner s3 = new Scanner(System.in);
			 c=s3.nextInt();
			 for(i=2;i<=c-1;i++)
			 {
				 if(c%i==0)
				 {
					 temp = temp+1;
				 }
				 
			 }
			 if(temp==0)
			 {
				 System.out.print(c+ " is   a Prime Number ");
			 }
			 else
			 {
				 System.out.print(c+ " is not a Prime Number ");

			 }
		 }
		 else if(b==3)
		 {
			 System.out.println("\n 		Fibonacci Series "); 
			 int n1=0,n2=1,n3=0,n;
			 System.out.print("\nEnter Length : ");
			 Scanner s4 = new Scanner(System.in);
			 n = s4.nextInt();
			 for(int i =0;i<n;i++)
			 {
				
				 System.out.print(" "+n1);
				 n3=n2+n1;
				 n1=n2;
				 n2=n3;
			 }
		 }
		 else if(b==4)
		 {
			 System.out.println("\n 		Palindrome String ");
			 System.out.print("\n 		Enter String  : "); 
			 String rev ="";
			 Scanner s5 = new Scanner(System.in);
			 String nam = s5.next();
			 for(int i =nam.length()-1;i>=0;i--)
			 {
				 rev = rev + nam.charAt(i);
			 }
			 if(nam.equals(rev))
			 {
				 System.out.println(nam+"  is Palindrome String "); 

			 }
			 else
			 {
				 System.out.println(nam+"  is not a Palindrome String "); 

			 }
		 }
		 else if(b==5)
		 {
			 System.out.println("\n 		Reverse String ");
			 System.out.print("\n 		Enter String  : "); 
			 String rev ="";
			 Scanner s5 = new Scanner(System.in);
			 String nam = s5.next();
			 for(int i =nam.length()-1;i>=0;i--)
			 {
				 rev = rev + nam.charAt(i);
			 }
				 System.out.println("Original String : "+nam ); 
				 System.out.println("Reverse String : "+rev); 

			 }
		}while(b!=0);	 
	}
}
