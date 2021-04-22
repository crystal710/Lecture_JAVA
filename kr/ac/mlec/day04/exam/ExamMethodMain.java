package kr.ac.mlec.day04.exam;

import java.util.Arrays;

public class ExamMethodMain {
	
	public static void main(String[] args) {
		ExamMethod exam = new ExamMethod();
		
		int result = exam.add(1,10);
		int total = exam.sum(1,10);
		
		int[] nums = {1, 3, 6, 8, 11};
		System.out.println("1 + 3 + 6 + 8 + 11 : " + exam.add(nums));
		
		nums = new int[] {1, 3, 6, 8};
		System.out.println("1 + 3 + 6 + 8 : " + exam.add(nums));
		
		
		System.out.println("1 + 10 : "+ result);
		System.out.println("1 + 10 : "+ exam.add(1, 10)); // return값이 있을때만 println에 사용가능
		System.out.println("1 ~10 총합 : " + total);
		System.out.println("1 ~10 총합 : " + exam.sum(1, 10));
		
		int[] numbers = exam.getNums(); // 1 ~ 100 사이의 난수를 2개 추출하여 넘겨주는 기능
		
		System.out.println("추출된 정수 : " + Arrays.toString(numbers));
		
		numbers = exam.getNums(10); //1~100사이의 난수를 10개 추출
		System.out.println("getNums(10) 추출된 정수 : " + Arrays.toString(numbers));
		numbers = exam.getNums(3);
		System.out.println("getNums(3) 추출된 정수 : " + Arrays.toString(numbers));
		
		numbers = exam.getNums(50,5); //1~50사이의 난수를 5개 추출
		System.out.println("getNums(50,5) 추출된 정수 : " + Arrays.toString(numbers));
		numbers = exam.getNums(20,5); //1~20사이의 난수를 5개 추출
		System.out.println("getNums(20,5) 추출된 정수 : " + Arrays.toString(numbers));
		
	}

}
