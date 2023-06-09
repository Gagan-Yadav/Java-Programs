package lab_2021;

interface bike{
	public void name(); 
}


interface car{
	public void colour();
}

class cycle implements car{
	public void colour() {
		System.out.println("Cycle colour is Red");
	}

}

class vehicle implements bike,car{
	vehicle(String s, int a){
		System.out.println("Constructor of vehicle(Derived) Class");
		System.out.println(s+"  "+a);
	}
	public void name() {
		System.out.println("Method from Bike");
	}
	public void colour() {
		System.out.println("Method from Car");
	}
}


public class MultipleInheritance {

	public static void main(String[] args) {
		vehicle v = new vehicle("I am Gagan",07);
		v.name();
		v.colour();
		cycle c = new cycle();
		c.colour();
		
	}

}
