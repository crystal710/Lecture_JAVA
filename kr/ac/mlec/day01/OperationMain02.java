package kr.ac.mlec.day01;

import java.util.Scanner;

public class OperationMain02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("두번쨰 정수 입력 : ");
		int b = sc.nextInt();
		
		System.out.println("배수여부 판단 : " + ( b!=0 && a%b == 0));
	
		
		/* int a = 1, b= 0;
		
//		boolean bool = ++a >= 0 && ++b >=0;
		
		boolean bool = --a >0 && --b >=0; // b는 실행을 하지도 않음 a 가 이미 false라서 논리연산자는 순서가 중요
	
		
		System.out.println(bool + " : " + a + " : " + b);
		*/
	}

}
