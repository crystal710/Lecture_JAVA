package kr.ac.mlec.day02.exam;

import java.util.Scanner;

/*
 * 4개의 정수를 입력받아 가장 큰수를 출력하는 코드를 작성
 * 
 * 첫번째 정수 입력 : 12
 * 두번째 정수 입력 : 8
 * 세번째 정수 입력 : 20
 * 네번째 정수 입력 : 17
 * 
 * 가장 큰수 : 20
 */
public class ExamMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 :");
		int num = sc.nextInt();
		
		System.out.print("두번째 정수 입력 :");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 정수 입력 :");
		int num3 = sc.nextInt();
		
		System.out.print("네번째 정수 입력 :");
		int num4 = sc.nextInt();
		
		if (num > num2 && num > num3 && num > num4) {
			System.out.println("가장 큰수 : " + num);
		} else if (num2 > num && num2 > num3 && num2 > num4) {
			System.out.println("가장 큰수 : " + num2);
		} else if (num3 > num && num3 > num2 && num3 > num4) {
			System.out.println("가장 큰수 : " + num3);
		} else {
			System.out.println("가장 큰수 : " + num4);
		}
	}
}
