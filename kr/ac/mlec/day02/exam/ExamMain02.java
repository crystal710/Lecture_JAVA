package kr.ac.mlec.day02.exam;

import java.util.Scanner;

/*
 * 4���� ������ �Է¹޾� ���� ū���� ����ϴ� �ڵ带 �ۼ�
 * 
 * ù��° ���� �Է� : 12
 * �ι�° ���� �Է� : 8
 * ����° ���� �Է� : 20
 * �׹�° ���� �Է� : 17
 * 
 * ���� ū�� : 20
 */
public class ExamMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� :");
		int num = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է� :");
		int num2 = sc.nextInt();
		
		System.out.print("����° ���� �Է� :");
		int num3 = sc.nextInt();
		
		System.out.print("�׹�° ���� �Է� :");
		int num4 = sc.nextInt();
		
		if (num > num2 && num > num3 && num > num4) {
			System.out.println("���� ū�� : " + num);
		} else if (num2 > num && num2 > num3 && num2 > num4) {
			System.out.println("���� ū�� : " + num2);
		} else if (num3 > num && num3 > num2 && num3 > num4) {
			System.out.println("���� ū�� : " + num3);
		} else {
			System.out.println("���� ū�� : " + num4);
		}
	}
}
