import java.util.Scanner;

public class input {

	public static void main(String[] args) {
	int v,b,r = 0;
 System.out.print("Calculator\n");

  char c = 0;
  do {
	  
	 	System.out.print("\nEnter First Number : ");
	 	 Scanner s1 = new Scanner(System.in);
	 	  v = s1.nextInt();
	 	  System.out.print("Enter Second Number :");
	 Scanner s2 = new Scanner(System.in);
	 b = s2.nextInt();
	 	 
	 	 
	 
	 Scanner s = new Scanner(System.in);
	 System.out.print("Enter Operand : ");
	  char a;
	  a = s.next().charAt(0); 
	  
 switch (a) {
 case '+':
	 r = v+b;
	 System.out.println("\t"+v+" + "+ b +" = "+ r);
	 break;
 case '-':
	 r = v-b;
	 System.out.println("\t"+v+" - "+b+" = "+r);
	 break;
 case '*':
	 r = v*b;
	 System.out.println("\t"+v+" * "+b+" = "+r);
	 break;
 case '/':
	 r = v/b;
	 System.out.println("\t"+v+" / "+b+" = "+r);
	 break;
 default:
	 System.out.println("   !!!    You Entered Wrong Operand    !!!");
 
	}
 System.out.println("\n   Want to Exit for YES Enter y \n   		for No Enter n ");
 Scanner s5 = new Scanner(System.in);
 c = s5.next().charAt(0);
 
	}while(c!='y');
	}
}
