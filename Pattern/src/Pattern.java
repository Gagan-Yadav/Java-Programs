public class Pattern {

	public static void main(String[] args) {
       int a;
	   System.out.println("1. \n");

       for (int i =1;i<=5;i++)
       {
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print("*");
    	   }
		   System.out.print("\n");

       }
	   System.out.println("2. \n");

    for (int i =1;i<=5;i++)
    {
 	   for(int j=5;j>=i;j--)
 	   {
 		   System.out.print("*");
 	   }
		   System.out.print("\n");

    }

	   System.out.println("3. \n");

  for (int i =1;i<=5;i++)
 {
	   for(int j=5;j>=i;j--)
	   {
		   System.out.print(i);
	   }
		   System.out.print("\n");

 }
  System.out.println("4. \n");

for (int i =1;i<=5;i++)
{
  for(int j=1;j<=i;j++)
  {
	   System.out.printf("%c",j+64);//using Ascii value
  }
	   System.out.print("\n");

}
System.out.println("5. \n");
 int n=5;
for (int i =1;i<=n;i++)
{
	n=n-1;
	System.out.print(" "); 
	for(int j=1;j<=n-1;j++)
{
	   System.out.printf("*");
	   
}
	   System.out.print("\n");
	   
   }
 }
}

