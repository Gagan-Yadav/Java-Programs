package lab_2021;

public class StringOperations {

	public static void main(String[] args) {
		
		String s1  = "gagan";
		String s2 = "gagany";
		String s3 = new String("gagan");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
	}

}
