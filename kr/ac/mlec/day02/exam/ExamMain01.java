package kr.ac.mlec.day02.exam;

import java.util.Scanner;

/*
 * �ΰ��� ������ �Է¹޾� ū���� ����ϴ� �ڵ带 �ۼ�
 * 
 * ù��° ������ �Է� : 10
 * �ι�° ������ �Է� :6
 * 
 * ���� ū�� : 10 
 * if������ ������
 */
public class ExamMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է� : ");
		int num = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		if(num > num2) {
			System.out.println("���� ū���� " + num);
		} else {
			System.out.println("���� ū���� " + num2);
		}
	}
}
