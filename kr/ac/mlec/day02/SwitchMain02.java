package kr.ac.mlec.day02;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 계절을 입력 : ");
		String season = sc.nextLine();
		
		switch(season) {
		case "봄" :
		case "SPRING" :
		case "spring" :
			System.out.println("봄은 3-5월까지 입니다.");
			break;
		case "여름" :
		case "SUMMER" :
		case "summer" :
			System.out.println("여름은 6-8월까지 입니다.");
			break;
		case "가을" :
		case "FALL" :
		case "fall" :
			System.out.println("가을은 9-11월까지 입니다.");
			break;	
		case "겨울" :
		case "WINTER" :
		case "winter" :
			System.out.println("겨울은 12- 2월까지 입니다.");
			break;
		}
	}
}
