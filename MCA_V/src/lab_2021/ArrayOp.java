package lab_2021;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayOp {

	public static void main(String[] args) throws InputMismatchException {
		System.out.print("Enter size of an Array : ");
		Scanner s = new Scanner(System.in);
		Scanner f = new Scanner(System.in);
		float sum =0;
		int n  = s.nextInt();
		try {
		float a [] = new float[n];
		for (int i=0;i<n;i++) {
			System.out.print("Enter "+i+" Element : ");
			 a[i] = f.nextFloat();
		}
		try {
			 System.out.println("\n");
		for (int i=0;i<n;i++) {
			 System.out.println(" Element "+i+" is : "+a[i]);
			 sum = sum+a[i];
		}
		System.out.print("\n Sum = "+sum);
		float high =a[0];
		for( int i =1; i<n;i++) {
			if(high>a[i]) {
				high = a[i];
				if(i==n) {
					System.out.print("Highest Element : "+high);
				}
			}else {
				a[i]=high;
			}
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		}

	}

