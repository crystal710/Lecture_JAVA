package kr.ac.mlec.day02;

import java.util.Scanner;

/*
 * 1 -3 ������ ������ �Է� : 1
 * ON
 * 
 * 1�Է½� ONE ���
 * 2�Է½� TWO ���
 * 3�Է½� THREE ���
 * �ƴ϶�� ERROR ���
 */

public class SwitchMain01 { //switch�� ������� �� ��� ����

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1-3 ������ ������ �Է� : ");
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
		default : //switch���� if���� else�� ������ ��
			System.out.println("ERROR");
		}
		
		
	}
}
