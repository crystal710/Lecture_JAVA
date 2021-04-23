package kr.ac.mlec.day05;

public class StringMain02 {

	public static void main(String[] args) {
		
		String a = "hello";
		String b = "hello";
		
		if(a==b) {
			System.out.println("a == b");
		}else {
			System.out.println("a != b");
		}
		
		String c = new String("hello");
		String d = new  String("hello");
		
		if(c==d) {
			System.out.println("c == d");
		}else {
			System.out.println("c != d");
		}
	}
}
