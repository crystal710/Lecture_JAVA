package kr.ac.mlec.day03;

import java.util.Scanner;

/*
 * 5���� ������ �Է¹޾� ������ ���� ����ϴ� �ڵ带 �ۼ�
 * 
 * num1 : 83
 * num2 : 12
 * num3 : 93
 * num4 : 8
 * num5 : 17
 * 
 * < PRINT >
 * 83 12 92 8 17
 * 
 * 
 * < REVERSE >
 * 71 80 29 21 38
 * 
 * ���1
 * 17 8 92 12 83
 * 
 * < ¦�� >
 * 2 92 8
 * 
 * < Ȧ�� >
 * 83 17
 */
public class ArrayMain04 {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		//���2
		for(int i = 0 ; i < nums.length; ) {
			System.out.print("num" + (i+1) + " : ");
			nums[i] = sc.nextInt();
			if(!(nums[i] >=0 && nums[i] < 100)) {
				System.out.println("0-99������ ���ڸ� �Է��Ͻÿ�.");
			}
			
			if(nums[i] >=0 && nums[i] < 100) {
				i++;
			}
			
		}
		
		/* ���1
		for(int i = 0 ; i < nums.length; i++) {
			System.out.print("num" + (i+1) + " : ");
			nums[i] = sc.nextInt();
			
			if(!(nums[i] >=0 && nums[i] < 100)) {
				System.out.println("�߸��ϼ̽��ϴ�. 0-99���̷θ� �Է��ϼ���");
				i--;
			}
		}
		*/

		System.out.println("< PRINT >");
		for(int i = 0 ; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(int i = nums.length-1; i >= 0 ; i--) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		System.out.println("< REVERSE2 >");
		for(int i = nums.length-1; i >= 0 ; i--) {
			int n10 = nums[i] / 10;
			int n1 = nums[i] % 10;
			System.out.print((n10+n1*10) + " ");
		}
		System.out.println();
		
		System.out.println("< ¦�� >");
		for(int i = 0 ; i <nums.length; i++) {
			if(nums[i]%2 == 0) {
				System.out.print(nums[i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("< Ȧ�� >");
		for(int num :nums) {
			if(num%2 == 1) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

}
