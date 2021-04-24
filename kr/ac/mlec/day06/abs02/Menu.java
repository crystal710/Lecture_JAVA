package kr.ac.mlec.day06.abs02;

import java.util.Scanner;

public class Menu {
	
	public void process() {

		Scanner sc = new Scanner(System.in);
		System.out.print("V2 ����� �����͸� �����ϼ���(1.LG 2.�Ｚ 3.HP) : ");
		int no = sc.nextInt();
		
		Printer p = null;
		switch(no) {
		case 1 :
			p = new LGPrinter(); //���� �����ڸ� �������� ������ ������Ÿ���� �ٸ��� ��Ӱ����϶��� ��ü����ȯ�� ����
			break;
		case 2 :
			p = new SamsungPrinter();
			break;
		case 3 :
			p = new HPPrinter();
			break;
		}
		if(p != null) {
			p.print();
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
		/*
		switch(no) {
		case 1 : 
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case 2 : 
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
			break;
		case 3 :
			HPPrinter hp = new HPPrinter();
			hp.print();
			break;
		}
		*/
		
	}

}
