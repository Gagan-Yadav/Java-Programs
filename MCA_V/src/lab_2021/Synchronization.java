package lab_2021;

class Table{
	synchronized void prinTtable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			System.out.println("					Gagan");
			try {
				Thread.sleep(400);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t = t;
	}
	public void run() {
		t.prinTtable(5);
	}
}
class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t = t;
	}
	public void run() {
		t.prinTtable(100);
	}
}
public class Synchronization {

	public static void main(String[] args) {
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();

	}

}
