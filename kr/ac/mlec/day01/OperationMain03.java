package kr.ac.mlec.day01;

import java.util.Scanner;

public class OperationMain03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int num = sc.nextInt();
		
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		
//		int max = (num > num2 ? num : num2);
//		System.out.println("���� ū ���� : " + max);

//		System.out.println("���� ū�� : " + (num > num2 ? num : num2)); //3�� �����ڴ� ���ڻ��̿� ���� ���� ���ǹ����� ����
		
		int max = num > num2 ? num : (num < num2 ? num2 : 0);
		System.out.println("���� ū�� : " + max);
				
	}
}
