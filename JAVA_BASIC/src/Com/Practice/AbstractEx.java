package Com.Practice;


abstract class GY{
	abstract void show();
}

public class AbstractEx extends GY {
	AbstractEx(){
	  System.out.println("AbstractEx Constructor");	
	}
void show() {
	System.out.println("GAGAN");
}
	public static void main(String[] args) {
		AbstractEx s = new AbstractEx();
		s.show();
		Sample1 s1 = new Sample1();
		s1.show();
		s1.samp(07);
	
	}

}

 class Sample1 extends GY{
	 
	 Sample1(){
		 System.out.println("Sample1 Constructor");
	 }

	void show() {
		System.out.println("From Sample 1");
		
	}
	void samp(int a){
		System.out.println("A = "+a);
	}
	
}
