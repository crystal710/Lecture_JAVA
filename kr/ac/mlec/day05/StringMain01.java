package kr.ac.mlec.day05;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = new String();
		String str2 = new String("Hello");
		
		char[] chars = { 'H','E','L','L','O'};
		String str3 = new String(chars);
		String str4 = new String(chars, 1, 3); //String(������, index, ���� index�κ��� �)
		
		String str5 = "Hello"; // heap�� ������ �������ʰ� ���� "hello"�� ����Ű�°� -> ������ڿ��̶�� ����
		
		System.out.println("str : [" + str+ "]");
		System.out.println("str2 : [" + str2+ "]");
		System.out.println("str3 : [" + str3+ "]");
		System.out.println("str4 : [" + str4+ "]");
	}
}
