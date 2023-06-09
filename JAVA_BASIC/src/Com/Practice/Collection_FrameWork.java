package Com.Practice;
import java.util.*;
public class Collection_FrameWork {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("\n________________________________________________________________________");
			System.out.println(" \n 1. Array List \n 2. Linked List \n 3. Vector \n 4. Stack \n 5. Exit");
			System.out.print(" Enter Your Choice : ");
			n=s.nextInt();
			System.out.println("________________________________________________________________________");

		switch(n) {
		case 1:
			
				System.out.println("\n   !!!  Array List  !!!  ");
				ArrayList<String> a1 = new ArrayList<String>();
			
				a1.add("Tushant");
				a1.add("Gagan");
				a1.add("007");
				a1.add(2,"Chiku");    	  // Element at the Index
//				a1.remove(2);         	 // Remove at particular index
//				a1.set(1,"Ra.One");	   	//Set Element at given Index
//				Collections.sort(a1);  //Sort the list(Characters in ABC, Number in 1,2,3)
				
				System.out.print("\n "+a1);
//				System.out.print("\n "+a1.size());
//				System.out.print("\n "+a1.isEmpty());
//				System.out.print("\n "+a1.get(2);       // Element at particular Index
//				a1.clear(); // Remove all Elements
				
//				Scanner s2 = new Scanner(System.in);  // Dynamic Insert
//				String sa = s2.nextLine();
//				a1.add(sa);
//				For Multiple Columns, Define Custom Class With Arguments then create list of that class type like 
//				ArrayList<className> a1= new ArrayList<className>();
			break;
			
		case 2:
				System.out.println("\n   !!!  Array List  !!!  ");
				LinkedList<String> l1 = new LinkedList<String>();
				l1.add("Chiku");
				System.out.println("\n "+l1);
				break;
				
		case 3:
		      	System.out.println("\n   !!!  Vector  !!!  ");
				
		case 5:
			System.out.print("   \n   Thank You ...");
			System.exit(0);
			break;
				default:
					System.out.print("\n !!!   Invalid Choice  !!!");
		
		}
		}while(n!=5);
  
	}

}
