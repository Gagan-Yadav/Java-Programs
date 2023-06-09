package Com.Practice;
import java.io.*;

class student implements Serializable{
	int rollno,phy,chem,maths;
	String name;

	   void inputdata(int r, int p,int c,int m, String name){
		   this.rollno =  r;
		   this.phy = p;
		   this.chem = c;
		   this.maths = m;
		   this.name = name;	   
	   }
	   void showdata() {
		   System.out.print("\n  Name      : "+name);
		   System.out.print("\n  Roll No.  : "+rollno);
		   System.out.print("\n  Physics   : "+phy);
		   System.out.print("\n  Chemistry : "+chem);
		   System.out.print("\n  Maths     : "+maths);
	   }
	    
}
public class Serialization_Ex {

	public static void main(String[] args) {
		
            student s = new student();
            s.inputdata(27, 98, 96, 99, "Gagan Yaduvanshi");
            student s1 = new student();
            s1.inputdata(27, 98, 96, 99, "Tushant Yaduvanshi");

//            s.showdata();
            
            try {
            	
            	FileOutputStream fos = new FileOutputStream("G:/First_Serialization.txt");
            	ObjectOutputStream objout = new ObjectOutputStream(fos);
            	objout.writeObject(s);
            	objout.writeObject(s1);
            	
            	FileInputStream filein = new FileInputStream("G:/First_Serialization.txt");
            	ObjectInputStream objin = new ObjectInputStream(filein);
            	
            	student s2 = (student) objin.readObject();
            	
            	 System.out.print("\n  Name      : "+s2.name);
      		   System.out.print("\n  Roll No.  : "+s2.rollno);
      		   System.out.print("\n  Physics   : "+s2.phy);
      		   System.out.print("\n  Chemistry : "+s2.chem);
      		   System.out.print("\n  Maths     : "+s2.maths);
      		   
      		   objout.close();
            	objin.close();
            	
            }catch(Exception e) {
            	e.getStackTrace()
;            }
	}

}
