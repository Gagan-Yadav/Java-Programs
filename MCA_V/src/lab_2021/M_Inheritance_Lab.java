package lab_2021;

interface StudentIntf{
	float getTotal();
	float getPercentage(float total);
}

class Student{
	int rno;
	String name;
	float hm,em;
	void set(){
		this.rno = 27;
		this.name = "Gagan Yadav";
	}
	void show() {
		System.out.println(" Roll Number : "+rno);
		System.out.println(" Name        : "+name);
	}
}
class ScienceStudent extends Student implements StudentIntf{
	float phy,chem,maths;
	static float total;
	float pr;
	
	public void set() {
		this.em = 98.8f;
		this.hm = 99.2f;
		this.phy = 96.6f;
		this.chem = 95.5f;
		this.maths = 99.7f;
	}
  void show() {
	  System.out.println("\n\n English     : "+em);
	  System.out.println(" Hindi       : "+hm);
	  System.out.println(" Physics     : "+phy);
	  System.out.println(" Chemistry   : "+chem);
	  System.out.println(" Maths       : "+maths);
	  
  }
	public float getTotal() {
		
		total = em+hm+maths+phy+chem;
		System.out.println("\n\n Total      : "+total);
		return total;
	}
	public float getPercentage(float total) {
		pr=total/5;
		System.out.println(" Percentage : "+pr);
		return pr;
	}
}
public class M_Inheritance_Lab {


	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		s.show();
		ScienceStudent ss = new ScienceStudent();
		ss.set();
		ss.show();
		ss.getTotal();
		ss.getPercentage(ScienceStudent.total);

	}

}
