package kr.ac.mlec.day02.exam;

import java.util.Scanner;

public class ExamMain06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2 - 9 ������ ������ �Է� : ");
		int num = sc.nextInt();
		
		System.out.println("<1 ~ 100 ������ " + num + "�� ��� ���>");
		for(int i=1; i<=100 ; i++) {
			if(i % num == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
