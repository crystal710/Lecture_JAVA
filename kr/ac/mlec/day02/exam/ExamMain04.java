package kr.ac.mlec.day02.exam;

import java.util.Scanner;

/*
 * 라인수를 입력 : 6
 * 열 값을 입력 : 3
 * 
 * 
 	***
 	***
 	***
 	***
 	***
 	***
 */
public class ExamMain04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("라인수를 입력 : ");
		int row = sc.nextInt();
		
		System.out.print("열값을 입력 : ");
		int col = sc.nextInt();
		
		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j <= col ; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
