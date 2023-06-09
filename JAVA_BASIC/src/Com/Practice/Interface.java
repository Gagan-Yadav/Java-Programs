package Com.Practice;
interface Sample{

	void print();	
	static void gagan() {
		 // I don't want this implementation to be overriden
		 //and i can't declare this method as Final 
		System.out.println("This is Static Method gagan from Interface");
	}
}
class Interface implements Sample {
	
	public void print() {
		System.out.println("Main Class");	
	}
	public static void main(String[] args) {
		
		Sample.gagan();
		
		Interface i = new Interface();
		i.print();
		Sample2 s2 = new Sample2();
		s2.print();
		s2.gagan();

}
}
class Sample2 implements Sample{
	public void print() {
		System.out.println("Sample2 Class");
	}
	static void gagan() {
		int a=10;
		int b=10;
		System.out.println("OverRide Gagan");
		System.out.println(" a + b ="+(a+b));
	}
}