package kr.ac.mlec.day02;

import java.util.Scanner;

/*
 * 1 -3 사이의 정수를 입력 : 1
 * ON
 * 
 * 1입력시 ONE 출력
 * 2입력시 TWO 출력
 * 3입력시 THREE 출력
 * 아니라면 ERROR 출력
 */

public class SwitchMain01 { //switch는 동등비교일 때 사용 가능

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1-3 사이의 정수를 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			System.out.println("ONE");
			break;
		case 2 :
			System.out.println("TWO");
			break;
		case 3 : 
			System.out.println("THREE");
			break;
		default : //switch에선 if문의 else의 역할을 함
			System.out.println("ERROR");
		}
		
		
	}
}
