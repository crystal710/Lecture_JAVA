package kr.ac.mlec.day01;

import java.util.Scanner;

public class VariableMain {

	public static void main(String[] args) {
		
		//두 정수의 사칙연산 결과 출력
		/*
		 * 10 + 4 = 14
		 * 10 - 4 = 6
		 * 10 * 4 = 40
		 * 10 / 4 = 2.50
		 */
		
		//상수변수는 변수명을 항상 대문자로 사용
		
		Scanner sc = new Scanner(System.in); //키보드 입력은 Scanner 클래스를 이용하여 System.in 입력!
		
		//String name  = "홍길동";
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine(); // String 값을 입력하는건 nextLine
		System.out.println("내이름은 " + name + " 입니다.");
		
		System.out.print("논리값을 입력해봐(true/false) : ");
		boolean bool = sc.nextBoolean();
		System.out.println("bool : " + bool);
		
		System.out.print("첫번재 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n" , a, b, a+b);
		System.out.printf("%d - %d = %d\n" , a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		
		
		
		
		
		
	}

}
