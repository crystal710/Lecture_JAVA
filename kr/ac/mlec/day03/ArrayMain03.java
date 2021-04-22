package kr.ac.mlec.day03;

import java.util.Scanner;

/*
 * 5개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성
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
 * 방법1
 * 17 8 92 12 83
 */
public class ArrayMain03 {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0 ; i < nums.length; i++) {
			System.out.print("num" + (i+1) + " : ");
			nums[i] = sc.nextInt();
		}

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
	}

}
