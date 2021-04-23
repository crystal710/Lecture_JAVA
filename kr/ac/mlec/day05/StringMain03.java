package kr.ac.mlec.day05;

import java.util.Arrays;
import java.util.Scanner;

public class StringMain03 {
	
	public static void main(String[] args) {
		
		String str = "hello world";
		
		char[] chars = new char[str.length()];
		str.getChars(0, str.length(), chars, 0);
		
		System.out.println(Arrays.toString(chars));
		
		System.out.println("[" + str + "] 길이 : " + str.length());
		
		System.out.println("0번지에 위치한 문자 : " + str.charAt(0));
		System.out.println("7번지에 위치한 문자 : " + str.charAt(7));
		System.out.println("마지막에 위치한 문자 : " + str.charAt(str.length()-1));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력 : ");
		char c = sc.nextLine().charAt(0); //문자나 문자열을 문자열로 받고 문자를 추출
		System.out.println("입력된 문자 : " + c);
		
	}

}
