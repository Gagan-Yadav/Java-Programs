package Com.Practice;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBorder {

	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		
		String arr[]= {"abc","bcd","efg"};
		
		int row = arr.length;
		int col = arr[0].length();
		char[] firstrow = new char[col+2];
		Arrays.fill(firstrow,'*');
//		for(String x:firstrow) {
//			System.out.print(x);
//		}
		String[] bmatrix = new String[row+2];
		
		bmatrix[0] = new String (firstrow);
		
		for(int i=0;i<row;i++) {
			bmatrix[i+1] = "*"+arr[i]+"*";
		}
		
		char[] lastrow = new char[col+2];
		Arrays.fill(lastrow,'*');
		bmatrix[row+1] = new String (lastrow);
		
		for(String x:bmatrix) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
