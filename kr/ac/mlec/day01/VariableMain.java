package kr.ac.mlec.day01;

import java.util.Scanner;

public class VariableMain {

	public static void main(String[] args) {
		
		//�� ������ ��Ģ���� ��� ���
		/*
		 * 10 + 4 = 14
		 * 10 - 4 = 6
		 * 10 * 4 = 40
		 * 10 / 4 = 2.50
		 */
		
		//��������� �������� �׻� �빮�ڷ� ���
		
		Scanner sc = new Scanner(System.in); //Ű���� �Է��� Scanner Ŭ������ �̿��Ͽ� System.in �Է�!
		
		//String name  = "ȫ�浿";
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine(); // String ���� �Է��ϴ°� nextLine
		System.out.println("���̸��� " + name + " �Դϴ�.");
		
		System.out.print("������ �Է��غ�(true/false) : ");
		boolean bool = sc.nextBoolean();
		System.out.println("bool : " + bool);
		
		System.out.print("ù���� ���� �Է� : ");
		int a = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int b = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n" , a, b, a+b);
		System.out.printf("%d - %d = %d\n" , a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		
		
		
		
		
		
	}

}
