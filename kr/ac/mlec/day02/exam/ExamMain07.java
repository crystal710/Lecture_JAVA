package kr.ac.mlec.day02.exam;

import java.util.Scanner;

public class ExamMain07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2 - 100 ������ ���� �Է� : ");
		int num = sc.nextInt();
		int j = 0;
		
		System.out.println("<" + num + "�� ��� ���>");
		for(int i = 1; i<= num ; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
				j++;
			}
		}
		System.out.println();
		
		System.out.println("����� �� ���� : " + j);
	}

}
