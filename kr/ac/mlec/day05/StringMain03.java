package kr.ac.mlec.day05;

import java.util.Arrays;
import java.util.Scanner;

public class StringMain03 {
	
	public static void main(String[] args) {
		
		String str = "hello world";
		
		char[] chars = new char[str.length()];
		str.getChars(0, str.length(), chars, 0);
		
		System.out.println(Arrays.toString(chars));
		
		System.out.println("[" + str + "] ���� : " + str.length());
		
		System.out.println("0������ ��ġ�� ���� : " + str.charAt(0));
		System.out.println("7������ ��ġ�� ���� : " + str.charAt(7));
		System.out.println("�������� ��ġ�� ���� : " + str.charAt(str.length()-1));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է� : ");
		char c = sc.nextLine().charAt(0); //���ڳ� ���ڿ��� ���ڿ��� �ް� ���ڸ� ����
		System.out.println("�Էµ� ���� : " + c);
		
	}

}
