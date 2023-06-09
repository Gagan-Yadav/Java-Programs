package Com.Practice;

abstract class kl{
	 abstract void run();
}

public class OverrideOp extends kl {
	void run() {
		System.out.println("Override");
	}

	public static void main(String[] args) {
		OverrideOp o = new OverrideOp();
		o.run();
		vl v = new vl();
		v.run();

	}

}
class vl{
	void run() {
		System.out.println("From vl");
			
	}
}
