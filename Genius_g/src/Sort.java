import java.util.Scanner;

public class Sort {
	
	static int[] arr = new int[10]; 
	static Scanner s = new Scanner(System.in);

	static void show() {
		

		System.out.println("Enter Array Elements :");
		
		for(int i=0;i<10;i++)
		{

			if(s.hasNextInt()) {
			arr[i]= s.nextInt();	
			}
			else
		      {
			System.out.println("Please Enter Numbers");
			System.out.println("Enter Array Elements :");

			for(int i1=0;i1<10;i1++)
			{
				arr[i1]= s.nextInt();	
	
		      }
		      }
	
	
		}	

	}

	public static void main(String[] args) {
		
		show();
	for(int i=0;i<10;i++)
	{
		
		System.out.println(" >> "+arr[i]);
	}
	
	System.out.println(" G Sort");
	System.out.println("Enter Element for searching :");
 int g = s.nextInt();
	for(int i=0;i<10;i++)
	{
		if(arr[i]==g)
		{
			System.out.println(" Success");
		}
		for(int i1=10;i1>=1;i1++)
		{
			if(arr[i]==g)
			{
				System.out.println(" Success");
			}
		}
	}


}

	private static void get() {
		// TODO Auto-generated method stub
		
	}
}