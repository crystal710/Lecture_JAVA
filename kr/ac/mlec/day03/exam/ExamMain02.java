package kr.ac.mlec.day03.exam;

import java.util.Scanner;

/*
 	�л� 5���� ������ �Է¹޾� ������ ���� ����ϴ� �ڵ带 �ۼ�
 	
 	���࿹>
 	1's score : 75
 	2's score : 73
 	3's score : 10000
 	4's score : -9
 	5's score : 84
 	
 	
 	---------------
 	��ȣ  ����  ����
 	---------------
 	1    95   A
 	2    73   C
 	3    ERROR!
 	4    ERROR!
 	5    84  B
 	---------------
 	5�� ���� �Է� �� 2�� ���� �߻�!!
 	���� : 252��
 	��� : 50.40��    //System.out.printf("%.2f")
 	
 	
 	90�� �̻� A
 	80-89�� : B
 	70-79�� : C
 	60-69�� : D
 	60�� �̸� : F
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
		
		System.out.println("�й�  ����  ����");
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
		System.out.println(score.length + "�� ���� �Է� �� " + j+ "�� ERROR!! �߻�");
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.2f" , (double)sum/5);
		
		
	}

}
