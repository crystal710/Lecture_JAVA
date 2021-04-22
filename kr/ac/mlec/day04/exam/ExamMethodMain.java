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
		System.out.println("1 + 10 : "+ exam.add(1, 10)); // return���� �������� println�� ��밡��
		System.out.println("1 ~10 ���� : " + total);
		System.out.println("1 ~10 ���� : " + exam.sum(1, 10));
		
		int[] numbers = exam.getNums(); // 1 ~ 100 ������ ������ 2�� �����Ͽ� �Ѱ��ִ� ���
		
		System.out.println("����� ���� : " + Arrays.toString(numbers));
		
		numbers = exam.getNums(10); //1~100������ ������ 10�� ����
		System.out.println("getNums(10) ����� ���� : " + Arrays.toString(numbers));
		numbers = exam.getNums(3);
		System.out.println("getNums(3) ����� ���� : " + Arrays.toString(numbers));
		
		numbers = exam.getNums(50,5); //1~50������ ������ 5�� ����
		System.out.println("getNums(50,5) ����� ���� : " + Arrays.toString(numbers));
		numbers = exam.getNums(20,5); //1~20������ ������ 5�� ����
		System.out.println("getNums(20,5) ����� ���� : " + Arrays.toString(numbers));
		
	}

}
