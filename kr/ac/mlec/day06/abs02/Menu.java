package kr.ac.mlec.day06.abs02;

import java.util.Scanner;

public class Menu {
	
	public void process() {

		Scanner sc = new Scanner(System.in);
		System.out.print("V2 출력할 프린터를 선택하세요(1.LG 2.삼성 3.HP) : ");
		int no = sc.nextInt();
		
		Printer p = null;
		switch(no) {
		case 1 :
			p = new LGPrinter(); //대입 연산자를 기준으로 양쪽의 데이터타입이 다르고 상속관계일때만 객체형변환이 가능
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
			System.out.println("잘못입력하셨습니다.");
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
