package kr.ac.mlec.day02.exam;

import java.util.Scanner;

/*
	1�ܰ� : 
 	1 2 3 4 5 6 7 8 9 10
 	2�ܰ� : Ű����� ������ �ϳ� �Է¹޾� 1~ �Է¹��� ���� ���
 		������ �Է� : 20
 	3�ܰ� : Ű����� ������ �ϳ� �Է¹޾� 1 ~ �Է¹��� ���� ������ Ȧ�� ���
 		������ �Է� : 15
 	4�ܰ� : ���� 2���� �Է¹޾� ���������� ū������ ���� ���
 			ù��° ���� : 6
 			�ι�° ���� : 12
 			
 			ù���� ���� : 10
 			�ι�° ���� : 4
 */

public class ExamMain03 {

	public static void main(String[] args) {
		
		/*
		 * 1�ܰ�
		 * 
		for(int cnt = 1 ; cnt <= 10 ; cnt++) {
			System.out.print(cnt + " ");
		}
		System.out.println();
		
		2�ܰ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		int y = sc.nextInt();
		
		for(int i = 1 ; i <= y ; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		3�ܰ�
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("������ �Է� : ");
		int s = sc2.nextInt();
		
		for(int i = 1 ; i <= s ; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		*/
		
		// 4�ܰ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 2���� �Է� : ");
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
