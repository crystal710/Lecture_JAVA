package kr.ac.mlec.day02.exam;

import java.util.Scanner;

/*
 * ���μ��� �Է� : 6
 * �� ���� �Է� : 3
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
		System.out.print("���μ��� �Է� : ");
		int row = sc.nextInt();
		
		System.out.print("������ �Է� : ");
		int col = sc.nextInt();
		
		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j <= col ; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
