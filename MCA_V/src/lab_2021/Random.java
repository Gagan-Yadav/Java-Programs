package lab_2021;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		System.out.println("Welcome to Greed Island");
		double a = Math.random();
		a = a*10+1;
		int r = (int) a;
		
		System.out.println("Enter Any Number - ");
		Scanner s = new Scanner(System.in);
		double in = s.nextDouble();
		for(int k =0;k<=10;k++) {
		if(k==in) {
			System.out.println("Congratulations \n You are Lucky");
		}else
		{
			System.out.println(" \n Better Luck Next Time");
			System.out.println(" \n The Number is - "+r);
		}
		}

	}

}
