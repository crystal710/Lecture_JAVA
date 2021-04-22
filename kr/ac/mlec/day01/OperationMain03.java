package kr.ac.mlec.day01;

import java.util.Scanner;

public class OperationMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
//		int max = (num > num2 ? num : num2);
//		System.out.println("가장 큰 수는 : " + max);

//		System.out.println("가장 큰수 : " + (num > num2 ? num : num2)); //3항 연산자는 문자사이에 들어갈수 있음 조건문보다 빠름
		
		int max = num > num2 ? num : (num < num2 ? num2 : 0);
		System.out.println("가장 큰수 : " + max);
				
	}
}
