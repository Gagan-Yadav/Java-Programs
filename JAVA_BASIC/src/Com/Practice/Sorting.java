package Com.Practice;

import java.util.Scanner;
import java.util.*;

public class Sorting {

//	
//	static void get() {
//		System.out.print("enter size :");
//		
//		Scanner s= new Scanner(System.in);
//		int n= s.nextInt();
//		int [] a = new int[n];
//		System.out.print("Eneter the Array elements :");
//		for(int i=0;i<n;i++) {
//			a[i]=s.nextInt();
//		}
//		int temp = n-1;
//		for(int i= n-1;i>=0;i--) {
//			if(a[i]!=0) {
//				a[temp]=a[i];
//				temp--;
//				System.out.print("temp ="+temp);
//			}
//		}
//		while(temp>=0) {
//			a[temp]=0;
//			temp--;
//			System.out.print(" w temp =\n"+temp);
//		}
//			System.out.println(Arrays.toString(a));
//	}

	
	
	
	
	
	
	
	
	public static void main(String[] args)  {
		//get();
		
		int [] array = new int[10];
		int temp = 0;
		System.out.print("Enter the Number of elements you want to store : ");
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.print("Enter elements of an array : ");
		for(int i=0;i<n;i++) {
			
			array[i]=s.nextInt();
		}
		System.out.println("Array Elements Are : ");
		for(int j=0;j<n;j++) {
			for(int m =1;m<(n-j);m++) {
				if(array[j-1]>array[j]) {
					temp = array[j-1];
					array[j-1]=array[j];
					array[j] = temp;
					
				}
			}
		}
		System.out.println("ggg");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);

		}
		ArrayList l1 = new ArrayList();
		l1.add(34);
		Scanner s1 = new Scanner(System.in);
	                    l1.add(System.in);
	}

}
