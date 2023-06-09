package Com.Practice;
import java.util.Scanner;

public class Matrix_Opn {

	Matrix_Opn(){
		System.out.println("   Matrix Operations  \n");
	}
	
	void oned() {
		System.out.println("    One Dimensional Array   \n");
		System.out.print("How Many Elements You Want to Store ?  \n"
				       + "                              Enter - ");
		
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		int [] arr = new int[n];
		
		System.out.println("Enter Array Elements - ");
		for(int i=0;i<n;i++) {
			arr[i]=s1.nextInt();
		}
		
		System.out.println("Array Elements - ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void twod() {
		System.out.println("    Two Dimensional Array \n");
		System.out.print("  Enter Size Of 2D Array - ");
		Scanner s1 = new Scanner(System.in);
		int n= s1.nextInt();
		System.out.print(" x ");
		int n1 = s1.nextInt();
		int arr[][] = new int[n][n1];
		System.out.println("Enter First Row Element - ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n1;j++)
			{
				arr[i][j] = s1.nextInt();
			}
			
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Matrix_Opn m = new Matrix_Opn();
//		m.oned();
		twod();

	}

}
