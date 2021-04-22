package kr.ac.mlec.day04.exam;

import java.util.Scanner;

public class IceCream {
	
	Scanner sc = new Scanner(System.in);
	int num;
	String[] name;
	int[] price;
	
	IceCream(){
		System.out.print("아이스크림 몇개 구입할래? ");
		num = sc.nextInt();
		sc.nextLine();
		
		this.name =new String[num];
		this.price = new int[num];
	}

	
	void inputIce() {
		
		for(int i=0; i<num; i++) {
		
			System.out.println("*** " +(i+1)+"번째 아이스크림 구매정보 입력 ***");
			
			System.out.print("아이스크림명 : ");
			name[i] = sc.nextLine();
			
			System.out.print("아이스크림 가격 : ");
			price[i] = sc.nextInt();
			sc.nextLine();
			
			
		}
		
	}
	
	void print() {
		System.out.println("< "+ num +"개의 아이스크림 구매정보 출력 >");
		System.out.println("번호   아이스크림명   아이스크림가격");
		for(int i=0; i<num; i++) {
			System.out.println((1+i) + "      " + name[i]+"      "+price[i]);
		}
	}

}
