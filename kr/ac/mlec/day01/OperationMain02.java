package kr.ac.mlec.day01;

import java.util.Scanner;

public class OperationMain02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		int a = sc.nextInt();
		
		System.out.print("�ι��� ���� �Է� : ");
		int b = sc.nextInt();
		
		System.out.println("������� �Ǵ� : " + ( b!=0 && a%b == 0));
	
		
		/* int a = 1, b= 0;
		
//		boolean bool = ++a >= 0 && ++b >=0;
		
		boolean bool = --a >0 && --b >=0; // b�� ������ ������ ���� a �� �̹� false�� �������ڴ� ������ �߿�
	
		
		System.out.println(bool + " : " + a + " : " + b);
		*/
	}

}
