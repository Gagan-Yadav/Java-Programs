











import java.util.*;

public class Bubble {

	public static void main(String args[]) {
		System.out.println(" Enter Size of an array : ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int  arr[] = new int[a];
		System.out.println("Enter Array Elemnts : ");
		for(int i =0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		for(int i =0;i<arr.length;i++) {
			System.out.println(" elemnts at "+i+" = "+arr[i]);
		}
		
		System.out.println("\n  Sorting Begins Here \n");
		
		for(int k =0;k<arr.length;k++) {
			for(int m =0;m<arr.length-k-1;m++) {
				
				if(arr[m]>arr[m+1])
				{
					int temp = 0;
					temp = arr[m];
					arr[m] = arr[m+1];
					arr[m+1] = temp;
				}
			}
		}
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(" elemnts at "+i+" = "+arr[i]);
		}
		
	}
}
