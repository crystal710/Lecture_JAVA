package kr.ac.mlec.day06.abs01;

import java.util.Scanner;

public class Menu {
	
	public void process() {

		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 프린터를 선택하세요(1.LG 2.삼성) : ");
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
