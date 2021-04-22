package kr.ac.mlec.day04.exam;

import java.util.Scanner;

public class Calculator {
	
	int num;
	int num2;
	
	Calculator(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ã¹¹øÂ° Á¤¼ö :");
		int num = sc.nextInt();
		this.num = num;
		System.out.print("µÎ¹øÂ° Á¤¼ö :");
		int num2 = sc.nextInt();
		this.num2 = num2;
	}

	void add() {
		System.out.println("µ¡¼À : " + (num+num2));
	}
	
	void sub() {
		System.out.println("»¬¼À :  "+ (num-num2));
	}
	
	void mul() {
		System.out.println("°ö¼À :  "+ (num*num2));
	}
	
	void div() {
		System.out.printf("³ª´°¼À :  %.2f\n" ,((double)num/num2));
	}
	
	
	

}
