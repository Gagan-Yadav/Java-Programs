import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		MI a1 = new MI();
		int a=0;
		do {
		System.out.println(" 0. Exit \n 1. Character Array \n 2. Number Array \n 3. Mirror Inverse \n ");
		System.out.print("Enter Your Choice : ");

         Scanner s1 = new Scanner(System.in);
          a = s1.nextInt();
          if(a==1)
          {
         	 ca h = new ca();
         	 h.get();
          }
          else if(a==2)
         {
		ea c = new ea();
		c.get();
         }
         else if(a==0)
         {
        	 System.exit(0);
         }
         else if(a==3)
         {
        	 MI h = new MI();
        	 h.get();
         }
		}while(a!=0);
	}

}
class ea extends ArrayEx{
//	ea(){
//		System.out.println("			!!  Number Array   !!");
//	}
//	   static void get() {
//		   Int temp =0;
//			int [] array = new int[10];
//			System.out.print("Enter the Number of elements you want to store : ");
//			int n;
//			Scanner s = new Scanner(System.in);
//			n = s.nextInt();
//			System.out.print("Enter elements of an array : ");
//			for(int i=0;i<n;i++) {
//				
//				array[i]=s.nextInt();
//			}
//			
//
//			System.out.println("gshgdshgdh");
//			for(int j=0;j<n;j++) {
//				for(int m =1;m<(n-j);m++) {
//					if(array[j-1]>array[j]) {
//						temp = array[j-1];
//						array[j-1]=array[j];
//						array[j] = temp;
//						
//					}
//				}
//			}
//			
//			System.out.println("Array Elements Are : ");
//			for(int i=0;i<n;i++) {
//				System.out.println(array[i]);
//
//			}
//}
//}
//	class ca extends ArrayEx{	
//     static void get() {
//		
//		System.out.print("Enter the Number of elements you want to store : ");
//		int n;
//		Scanner s = new Scanner(System.in);
//		n = s.nextInt();
//		String [] array = new String[n];
//		System.out.print("Enter elements of an array : ");
//		for(int i=0;i<n;i++) {
//			
//			array[i]=s.next();
//		}
//		System.out.println("Array Elements Are : ");
//		for(int i=0;i<n;i++) {
//			System.out.println(array[i]);
//
//		}
// }	
//			ca(){
//		System.out.print(" 		!! Character Array    !! \n");
//			}
//	}
//	
//class MI{	
//
//	MI(){
//		
//		System.out.print(" 		!! Mirror Inverse Array    !! \n");
//			}
//			 
//	// System.out.print("Why?");
//	int n;
//	int [] arr  = new int[n];
//	
//	 void get() {
//		 System.out.print("Enter the Number of elements you want to store : ");
//		 Scanner s = new Scanner(System.in);
//		int a=s.nextInt();
//		int [] array = new int[a];
//		
//			System.out.print("Enter elements of an array : ");
//			for(int i=0;i<a;i++) {
//				
//				array[i]=s.nextInt();
//			}
//			System.out.println("Array Elements Are : "+"\t");
//			for(int i=0;i<a;i++) {
//				
//				System.out.println(array[i]);
//
//			}	
//		
//	    	 int temp = 0;
//	    	 for(int i=0;i<array.length;i++)
//	    	 {
//	    		 if(array[array[i]]!=i)
//	    		 {
//	    			 temp = temp+1;
//	    			 }
//	    	 }
//
//	    	 if(temp!=0)
//	    	 {
//    			 System.out.println("true");	
//
//	    	 }
//	    	 else
//	    	 {
//	    		 System.out.println("false");
//
//	    	 }
//	   }
//			
//   }
