package kr.ac.mlec.day02;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϴ� ������ �Է� : ");
		String season = sc.nextLine();
		
		switch(season) {
		case "��" :
		case "SPRING" :
		case "spring" :
			System.out.println("���� 3-5������ �Դϴ�.");
			break;
		case "����" :
		case "SUMMER" :
		case "summer" :
			System.out.println("������ 6-8������ �Դϴ�.");
			break;
		case "����" :
		case "FALL" :
		case "fall" :
			System.out.println("������ 9-11������ �Դϴ�.");
			break;	
		case "�ܿ�" :
		case "WINTER" :
		case "winter" :
			System.out.println("�ܿ��� 12- 2������ �Դϴ�.");
			break;
		}
	}
}
