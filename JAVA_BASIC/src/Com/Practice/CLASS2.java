package Com.Practice;

import java.util.Scanner;

class get{
	int a; 
	String q;
	String w;

	void form1(String p){
		//System.out.println("  "+p);
		Scanner s = new Scanner(System.in);
		//System.out.print("Enter your age : ");
		//a = s.nextInt();
		System.out.print("Enter your Name : ");
		Scanner g = new Scanner(System.in);
	    q =g.nextLine();
//		System.out.print("Enter your Gender : ");
//		w = g.nextLine();

		 show(p);

	}
	void show(String p) {
		System.out.println(" 			 "+p);

		//System.out.println("your age : "+a);
		System.out.print("your Name : "+q.toUpperCase().charAt(0));
		System.out.print(q.substring(1));
		//System.out.println("your Gender : "+w);

	}
}

public class CLASS2 {

	public static void main(String[] args) {
		
		 get g  = new get();
		System.out.println("what do you want : 1. jee \n   		    2. cet");
    Scanner s= new Scanner(System.in);
    int i = s.nextInt();
    if(i==1) {
       
        g.form1("jee");
    }
    else if(i==2) {
    	g.form1("cet");
    }
	}

}