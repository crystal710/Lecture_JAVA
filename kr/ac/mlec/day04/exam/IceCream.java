package kr.ac.mlec.day04.exam;

import java.util.Scanner;

public class IceCream {
	
	Scanner sc = new Scanner(System.in);
	int num;
	
	
	IceCream(){
		System.out.println("���̽�ũ�� � �����ҷ�?");
		int num = sc.nextInt();
	}

	void getIce() {
		for(int i=1; i<= num; i++) {
			System.out.println("*** " + i + "��° ���̽�ũ�� �������� �Է� ***");
			System.out.print("���̽�ũ���� : ");
		}
		
	}
	
	

}
