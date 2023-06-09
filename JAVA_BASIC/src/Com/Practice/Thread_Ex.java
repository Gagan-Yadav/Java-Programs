//Extending Thread Class
package Com.Practice;

class Ab extends Thread{
	static Ab a1 = new Ab();
	public static void g(){
		for(int i=0;i<=20;i++) {
			a1.yield();
		System.out.println("gagan");
	}
	}
	public void run() {
		for(int i=0;i<=20;i++) {
		System.out.println("wait a minute");
		try {
			this.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
//
//class BB extends Thread{
//	public static void g() {
//		for(int i=0;i<=20;i++) {
//		System.out.println("Tushant");
//	}
//	}
//	public void run() {
//		for(int i=0;i<=20;i++) {
//		System.out.println("Thread 2");
//		
//		}
//	}
//}
public class Thread_Ex {

	public static void main(String[] args) {
	Ab a1= new Ab();
	Ab a2 = new Ab();
	a1.start();
	a1.yield();
	 Ab.g();
	
	
	
for(int i=0;i<20;i++) {
	System.out.println("TGT");
	System.out.println("ID="+a1.getName());
}
        


//          BB b1 =new BB();
//          b1.run();
	
	}

}
