package lab_2021;
import java.util.Scanner;

interface salary{
		
	double salary();	
}

class employee implements salary{
	String name;
	int n;
	static double salary;
	double base_sal = 2000.00;
	void input() {
		System.out.println("      Employee Details   ");
		System.out.println("Enter your Full name : ");
		Scanner s = new Scanner(System.in);
		 name = s.nextLine();
		System.out.println("Enter your SSN Number : ");
		Scanner sc = new Scanner(System.in);
	   n = sc.nextInt();
	}
	void show( double salary) {
		System.out.println("Employee Name : "+name);
		System.out.println("SSN : "+n);
		System.out.print("Gross Salary :"+salary);
	}
	public double salary() {
		salary = base_sal+ 10;
		return salary;
	}
}
class H_emp extends employee{
	double total_H = 40;
	void show(double salary) {
		System.out.println("   !! Hourly Employees  !! ");
		System.out.println("Salary of 1 Hour is 700/- ");
		System.out.println("Employee Name : "+name);
		System.out.println("SSN : "+n);
		System.out.println("Your Total Hours : "+total_H);
		System.out.println("Gross Salary : "+salary);
	}
	public double salary(){
		salary = total_H * 700;
		return salary;
	}
}
public class Practice_Interface {

	public static void main(String[] args) {
		employee e = new employee();
//		e.input();
//		e.salary();
//		e.show(employee.salary);
		H_emp hour = new H_emp();
		hour.input();
		hour.salary();
		hour.show(employee.salary);
		
	}

}
