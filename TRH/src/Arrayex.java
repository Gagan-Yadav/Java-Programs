import java.util.*;
public class Arrayex {

	public static void main(String[] args) {
		User a = new User();
		a.input();
		
		
			
			}
	}

class User{
	
	static void input() {
	
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.print("Enter the Number of elements you want to store : ");
		int n = s.nextInt();
		int temp = 0;
		System.out.print("\n Enter Array Elements : ");
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=s.nextInt();
		}
		System.out.print("Input Array  : ");
       for(int i=0;i<n;i++) {
			
			System.out.print(" " + arr[i]);
		}

       
       int [] temparr = new int[n];
       for(int i=0;i<n;i++) {
    	   temparr[i]=arr[i];
       }
       
       
		System.out.print("\n\n 1 Output Array  : ");
		 for (int i = 0; i<n; i++)
		 {
                if (temparr[i] != 0) {
                	
                	arr[temp]=temparr[i];
                	temp++;
                }
              
		 }for(int i=0;i<n;i++) {
			 if (temparr[i]==0) {
			 arr[temp]=temparr[i];
			 temp++;
			 }
	 } for (int i=0; i<n; i++)
	 {
         System.out.print(arr[i]+" ");
        
	 }
     int temp2 =0;
     int [] temparr1 = new int[n];
     for(int i=0;i<n;i++) {
  	   temparr1[i]=arr[i];
     }
     
     
		System.out.print("\n 2 Output Array  : ");
		 for (int i = 0; i<n; i++)
		 {
              if (temparr1[i] == 0) {
              	
              	arr[temp2]=temparr1[i];
              	temp2++;
              }
            
		 }for(int i=0;i<n;i++) {
			 if (temparr1[i]!=0) {
			 arr[temp2]=temparr1[i];
			 temp2++;
			 }
	 } for (int i=0; i<n; i++)
	 {
       System.out.print(arr[i]+" ");
      
	 }
		 /* we can use directly  System.out.println(Arrays.toString(arr));
		  * 
		  * 
		  */
	}
}
































