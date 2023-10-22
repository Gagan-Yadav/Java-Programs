





package lab_2021;
import java.util.Scanner;

class Person extends RuntimeException{
	String name;
	int byear,age;
	Scanner s = new Scanner(System.in);
	
	public Person(int a, int b,String c) {
       
		   this.age = a;
		  this.byear = b;
		  this.name = c;
	
	}
    
	void input() {
		
		System.out.println("Enter Your Full Name : ");
		name=s.nextLine();
		System.out.println("Enter Your Birth Year : ");
		byear = s.nextInt();
	}
	void show() {
		age = 2021-byear;
		System.out.println("Name :"+name);
		System.out.println("Birth Year :"+byear);
		System.out.println("Age :"+age);
		if(age<18) {
			System.out.println("\n  not eligible for vote : "+age);
		}
		else {
			System.out.println("Eligible for Voting");
		}
	}
}
public class Voting_Excep {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Full Name : ");
		String c =s.nextLine();
		System.out.println("Enter Your Birth Year : ");
		int b = s.nextInt();
		
		int a = 2021-b;
	
		Person p = new Person( a, b, c);
//		p.input();
		p.show();
//		try {
//			p.Excep();
//		}catch(illegalAgeException e) {
//			System.out.println("Caught Exception");
//		}
		
	}

}
