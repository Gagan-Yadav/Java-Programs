package lab_2021;

import java.util.Scanner;

public class Swap_No {

	public static void main(String[] args) {
		System.out.print(" !!!  Swaping Numbers  !!!"
				+"\n\n Enter First Number : ");
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		System.out.print(" Enter Second Number :");
		int n1=s.nextInt();
				n=n+n1;
				n1=n-n1;
				n=n-n1;
				System.out.println("\n  After Swaping \n"
						+ "\n First Number : "+n+"\n Second Number : "+n1);
				
			}
	}

