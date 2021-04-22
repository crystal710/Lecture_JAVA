package kr.ac.mlec.day03.exam;

import java.util.Scanner;

/*
 	학생 5명의 성적을 입력받아 다음과 같이 출력하는 코드를 작성
 	
 	실행예>
 	1's score : 75
 	2's score : 73
 	3's score : 10000
 	4's score : -9
 	5's score : 84
 	
 	
 	---------------
 	번호  성적  학점
 	---------------
 	1    95   A
 	2    73   C
 	3    ERROR!
 	4    ERROR!
 	5    84  B
 	---------------
 	5명 성적 입력 중 2번 에러 발생!!
 	총점 : 252점
 	평균 : 50.40점    //System.out.printf("%.2f")
 	
 	
 	90점 이상 A
 	80-89점 : B
 	70-79점 : C
 	60-69점 : D
 	60점 미만 : F
 */
public class ExamMain02 {
	
	public static void main(String[] args) {
		
		int[] score = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<score.length;i++) {
			System.out.print((i+1)+"'s score : ");
			score[i]=sc.nextInt();
		}
		System.out.println();
		
		System.out.println("학번  성적  학점");
		System.out.println("----------------------");
		
		char grade;
		int j = 0;
		int sum=0;
		
		
		for(int i=0; i<score.length;i++) {
			if(score[i]>=0 && score[i]<=100) {
				switch(score[i]/10) {
					case 10:
					case 9: grade='A';
					case 8: grade='B';
					case 7: grade='C';
					case 6: grade='D';
					default : grade = 'F';
				}
				System.out.println((i+1) + "    " + score[i] + "    " + grade);
				sum += score[i];
			}else {
				System.out.println((i+1) + "    ERROR!  ");
				j++;
			}
		}
		System.out.println("----------------------");
		System.out.println(score.length + "명 성적 입력 중 " + j+ "번 ERROR!! 발생");
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f" , (double)sum/5);
		
		
	}

}
