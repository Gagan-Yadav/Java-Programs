package lab_2021;


class shape{
	String name,colour;
	void  setdata(){
		this.name = "Circle";
		this.colour = "green";
	 }
	void show() {
		System.out.println("Shape Name : "+name);
		System.out.println("Shape Colour : "+colour);	
	}
}

class circle extends shape{
	float radius = 2.5f;
	double z = 3.14 * radius * radius;
	void show() {
	System.out.println("Shape Name : "+name);
	System.out.println("Shape Colour : "+colour);
	System.out.println("The Area of the Cicle is : "+z);
	}
}
public class Inheritace_Shape {

	public static void main(String[] args) {
		 circle c = new circle();
		 c.setdata();
		 c.show();

	}

}
