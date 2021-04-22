package kr.ac.mlec.day02.exam;

import java.util.Scanner;

public class ExamMain09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2-9 사이 정수하나 입력: ");
		int dan = sc.nextInt();
		
		System.out.printf("***%d단***\n",dan);
		for(int i=1; i <= 9 ; i++) {
			System.out.printf("%d * %d = %d\n",dan, i, dan*i);
		}
		
		for(int i=1; i<=9 ; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n",i, j, i*j );
			}System.out.println();
		}
		
		System.out.print("시작단 입력: ");
		int start = sc.nextInt();
		System.out.print("종료단 입력: ");
		int end = sc.nextInt();
		
		int min=start, max=end;
		if(start>end) {
			min=end;
			max=start;
		}
		for(int i =1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n",min, i, min*i);
		}
		System.out.println();
		
		for(int i =1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n",max, i, max*i);
		}
	}

}
