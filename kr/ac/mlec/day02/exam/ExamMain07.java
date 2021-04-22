package kr.ac.mlec.day02.exam;

import java.util.Scanner;

public class ExamMain07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2 - 100 사이의 정수 입력 : ");
		int num = sc.nextInt();
		int j = 0;
		
		System.out.println("<" + num + "의 약수 출력>");
		for(int i = 1; i<= num ; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
				j++;
			}
		}
		System.out.println();
		
		System.out.println("약수의 총 개수 : " + j);
	}

}
