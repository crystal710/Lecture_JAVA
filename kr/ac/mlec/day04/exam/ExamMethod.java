package kr.ac.mlec.day04.exam;

import java.util.Random;

public class ExamMethod {

	int add(int a, int b) {
		return a+b;
	}
	
	int add(int[] nums) {
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

	int sum(int a, int b) { 
		int sum = 0;
		for(int i=a; i<=b; i++) {
			sum +=i;
		}
		return sum;
	}
	
	/**
	 1~100사이의 난수를 2개 추출하여 호출자에게 전달
	 @return [추출된 정수 2개]
	*/
	int[] getNums(int size) {
		/*
		Random r= new Random();
		int[] nums = new int[size];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = r.nextInt(100) + 1;
		}
		*/
		int[] nums = getNums(100, size);
		
		
		return nums;
	}
	int[] getNums(int max, int size) {
		Random r= new Random();
		int[] nums = new int[size];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = r.nextInt(max) + 1; 
		}
		
		return nums;
	}
	
	int[] getNums() {
		/*
		Random r= new Random();
		int[] nums = new int[2];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = r.nextInt(100) + 1; // 음수값만 나오려면 앞에 - 붙이면 된다
		}
		*/
		int[] nums= getNums(2);
		
		return nums;
		
	}

}
