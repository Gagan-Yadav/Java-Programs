package lab_2021;
import java.util.Scanner;

public class Reverse_No {

	public static void main(String[] args) {
		System.out.println("     !!!   Reverse Number  !!!");
			System.out.print("Enter any Number : ");
			Scanner s= new Scanner(System.in);
			int n = s.nextInt();
			int r,rev = 0,k = n;
			while(k!=0) {
				r=k%10;
				rev=rev*10+r;
				k=k/10;
			}
			System.out.print("Reverse Number : "+rev);
	}

}
