package Com.Practice;
import java.util.Scanner;

public class Shopping_Mall {
public static void main(String [] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Welcome to Shopping Mall Management");
	int b=0;
	do {
	
	System.out.print("\n\n\n\n\n	"+"Enter Username : ");
	String u= s.next();
	
	if(u.equals("gagan")) {
		
		
		System.out.print("\n	"+ "Enter Password : ");
		String p= s.next();
		if(p.equals("gagan123")) {
		b=3;
		
			
			
		}
		else {
			System.out.println("\n !!!!!!   Wrong Password           !!!!!");
			}	
	}else{
		
		b++;
		if(b==3) {
			System.out.println("YOu reached Maximum attempt limit");
		}
		
	}
	}while(b!=3);	
}
}
class shop{
	static void Ashops() {
		
	}
	static void show(){
		System.out.println(" 1.Availabel shops \n 2. Rented Shops \n 3. Pending Rent \n 4. Workers ");
		System.out.println(" Enter Your Choice : ");
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		switch(n){
		case 1:
			Ashops();
			break;
			default:
				System.out.println("Wrong choice");
			
		}
		
	}
}
