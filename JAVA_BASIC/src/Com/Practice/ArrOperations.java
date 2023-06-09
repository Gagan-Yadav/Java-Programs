package Com.Practice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrOperations {

	public static void main(String[] args) {
	//	System.out.print(args.length);
		System.out.println(" ");
		int a=0,b,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Size of an array : ");
		a=s.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter array Elements : ");
		for(int i=0;i<arr.length;i++) {
			try{
				arr[i]=s.nextInt();
			}catch(InputMismatchException e) {
				System.out.println(e);
			}
		}
		System.out.println("Elements are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("\t       "+arr[i]);
		}
    System.out.print(" Want to perform some operations(Y/N) ? ");
    Scanner g = new Scanner(System.in);
    String s1=g.nextLine();
   String s2 ="y";
   int k;
	boolean a1 = s1.equalsIgnoreCase(s2);

    if(a1){
    	do {
    	System.out.println("  0. Exit \n  1. Sum of Array Elements \n  2. Highest Element \n"
    			+ "  3. Lowest Element \n  4. Reverse Array");
    	 k=s.nextInt();
    	switch(k) {
    	
    	case 0:
    		System.out.println("\n      Thank You....   ");
    		System.exit(0);
    		break;
    		
    	case 1:
    	for(int i=0;i<arr.length;i++) {
    		sum = sum+arr[i];
    	}
    	System.out.println("Sum = "+sum);
    	break;
    	
    	case 2:
    		int max;
    		for(int i=0;i<arr.length;i++) {
    		
    			}
    		
    		break;
    		default:
    			System.out.println("!!!! Please Enter Valid Option !!!!");
    }
   }while(k!=0);
    }
    else
    {
    	System.out.println("You Entered Wrong Input");
    	System.out.print("Please Enter Y for Yes and N for No");
    	
    }
	}
}
