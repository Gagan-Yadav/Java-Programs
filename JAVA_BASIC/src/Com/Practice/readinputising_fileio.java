package Com.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readinputising_fileio {

	public static void main(String[] args) throws IOException {
		int a,b,c;
		System.out.println("    !! Sum   !!");
		System.out.print("Enter first number : ");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String s = null;
		s=br.readLine();
	   a=Integer.parseInt(s);	
	   System.out.print("Enter Second number : ");
	   s=br.readLine();
	   b=Integer.parseInt(s);
	   c=a+b;
	   System.out.println("the sum is : "+c);
	   System.out.println("\n\n      !!    Simple Interest     !! ");
	   System.out.print("Enter Principle : ");
	   s=br.readLine();
	   a=Integer.parseInt(s);
	   System.out.print("Enter Time : ");
	   s=br.readLine();
	   b=Integer.parseInt(s);
	   System.out.print("Enter Rate : ");
	   s=br.readLine();
	   c=Integer.parseInt(s);
	   int si;
	   si = (a*b*c)/100;
	   System.out.print("\n      Simple Interest : "+si);
	   
	   

	}

}
