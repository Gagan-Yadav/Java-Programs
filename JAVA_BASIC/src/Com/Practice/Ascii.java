package Com.Practice;
import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		
		
		System.out.println("Enter Character for ASCII Value ");
		char ch;
		Scanner s =  new Scanner(System.in);
		ch = s.next().charAt(0);
		 int ascii_value = ch;//implicit typecasting
		 
		 System.out.println("ASCII Value of "+ch+" is "+ascii_value);
	}

}
