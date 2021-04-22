package kr.ac.mlec.day04.exam;

import java.util.Scanner;

public class IceCream {
	
	Scanner sc = new Scanner(System.in);
	int num;
	
	
	IceCream(){
		System.out.println("아이스크림 몇개 구입할래?");
		int num = sc.nextInt();
	}

	void getIce() {
		for(int i=1; i<= num; i++) {
			System.out.println("*** " + i + "번째 아이스크림 구매정보 입력 ***");
			System.out.print("아이스크림명 : ");
		}
		
	}
	
	

}
