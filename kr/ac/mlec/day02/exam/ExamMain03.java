package kr.ac.mlec.day02.exam;

import java.util.Scanner;

/*
	1단계 : 
 	1 2 3 4 5 6 7 8 9 10
 	2단계 : 키보드로 정수를 하나 입력받아 1~ 입력받은 정수 출력
 		정수를 입력 : 20
 	3단계 : 키보드로 정수를 하나 입력받아 1 ~ 입력받은 정수 사이의 홀수 출력
 		정수를 입력 : 15
 	4단계 : 정수 2개를 입력받아 작은수에서 큰수순을 정수 출력
 			첫번째 정수 : 6
 			두번째 정수 : 12
 			
 			첫번재 정수 : 10
 			두번째 정수 : 4
 */

public class ExamMain03 {

	public static void main(String[] args) {
		
		/*
		 * 1단계
		 * 
		for(int cnt = 1 ; cnt <= 10 ; cnt++) {
			System.out.print(cnt + " ");
		}
		System.out.println();
		
		2단계
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 : ");
		int y = sc.nextInt();
		
		for(int i = 1 ; i <= y ; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		3단계
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("정수를 입력 : ");
		int s = sc2.nextInt();
		
		for(int i = 1 ; i <= s ; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		*/
		
		// 4단계
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 입력 : ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		int min = num, max =num2;
		if(num > num2) {
			min = num2;
			max = num;
		}
		for(int i = min ; i <= max ; i++) {
			System.out.print(i + " ");
		}
		
		/*
		if(num > num2) {
			for(int i = num2 ; i <= num ; i++) {
				System.out.print(i + " ");
			}
		}else {
			for(int i = num ; i <= num2 ; i++) {
				System.out.print(i + " ");
			}
		}
		*/
	}
}
