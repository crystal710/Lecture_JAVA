package kr.ac.mlec.day02.exam;

import java.util.Scanner;

/*
 * 두개의 정수를 입력받아 큰수를 출력하는 코드를 작성
 * 
 * 첫번째 정수를 입력 : 10
 * 두번째 정수를 입력 :6
 * 
 * 가장 큰수 : 10 
 * if문으로 만들어보기
 */
public class ExamMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		if(num > num2) {
			System.out.println("가장 큰수는 " + num);
		} else {
			System.out.println("가장 큰수는 " + num2);
		}
	}
}
