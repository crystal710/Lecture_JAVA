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
 * 
 * < 짝수 >
 * 2 92 8
 * 
 * < 홀수 >
 * 83 17
 */
public class ArrayMain04 {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		//방법2
		for(int i = 0 ; i < nums.length; ) {
			System.out.print("num" + (i+1) + " : ");
			nums[i] = sc.nextInt();
			if(!(nums[i] >=0 && nums[i] < 100)) {
				System.out.println("0-99사이의 숫자만 입력하시오.");
			}
			
			if(nums[i] >=0 && nums[i] < 100) {
				i++;
			}
			
		}
		
		/* 방법1
		for(int i = 0 ; i < nums.length; i++) {
			System.out.print("num" + (i+1) + " : ");
			nums[i] = sc.nextInt();
			
			if(!(nums[i] >=0 && nums[i] < 100)) {
				System.out.println("잘못하셨습니다. 0-99사이로만 입력하세요");
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
		
		System.out.println("< 짝수 >");
		for(int i = 0 ; i <nums.length; i++) {
			if(nums[i]%2 == 0) {
				System.out.print(nums[i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("< 홀수 >");
		for(int num :nums) {
			if(num%2 == 1) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

}
