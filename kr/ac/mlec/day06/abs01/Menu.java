package kr.ac.mlec.day06.abs01;

import java.util.Scanner;

public class Menu {
	
	public void process() {

		Scanner sc = new Scanner(System.in);
		System.out.print("����� �����͸� �����ϼ���(1.LG 2.�Ｚ) : ");
		int no = sc.nextInt();
		
		switch(no) {
		case 1 : 
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case 2 : 
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
			break;
		}
		
	}

}
