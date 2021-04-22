package kr.ac.mlec.day03;

import java.util.Arrays;

public class ArrayMain02 {
	
	public static void main(String[] args) {
		
		String[] strArr = {"2020년", "자바","교육"};
		
		/*
		 * 배열의 전체요소 출력방식 3가지
		 * 1. index를 이용한 출력
		 * 2. 1.5버전의 for문 이용한 출력N
		 * 3. Arrays.toString() 메소드를 이용한 출력
		 */
		
		
		System.out.println("< index를 이용한 출력 >");
		for(int i =0 ; i < strArr.length ; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("< 1.5버전의 for문을 이용한 출력 >");
		for(String str : strArr) {
			System.out.println(str);
		}
		
		//Arrays.toString(배열명);"[첫번째요소, 두번째요소, 세번째요소, 네번쨰요소, ...]" Arrays.toString(배열명)
		System.out.println("< Arrays.toString() 메소드를 이용한 출력 >");
		System.out.println(Arrays.toString(strArr));
	}

}
