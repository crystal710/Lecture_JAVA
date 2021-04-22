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

public class IFMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1-3 사이의 정수를 입력 : ");
		int num = sc.nextInt();
		
		if(num ==1) {
			System.out.println("ONE");
		} else if(num == 2) {
			System.out.println("TWO");
		} else if(num == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
		
		
	}
}
