package kr.ac.mlec.day05;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = new String();
		String str2 = new String("Hello");
		
		char[] chars = { 'H','E','L','L','O'};
		String str3 = new String(chars);
		String str4 = new String(chars, 1, 3); //String(변수형, index, 시작 index로부터 몇개)
		
		String str5 = "Hello"; // heap에 공간을 만들지않고 같은 "hello"를 가리키는것 -> 상수문자열이라고 말함
		
		System.out.println("str : [" + str+ "]");
		System.out.println("str2 : [" + str2+ "]");
		System.out.println("str3 : [" + str3+ "]");
		System.out.println("str4 : [" + str4+ "]");
	}
}
