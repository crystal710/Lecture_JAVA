package kr.ac.mlec.day03;

import java.util.Arrays;

public class ArrayMain02 {
	
	public static void main(String[] args) {
		
		String[] strArr = {"2020��", "�ڹ�","����"};
		
		/*
		 * �迭�� ��ü��� ��¹�� 3����
		 * 1. index�� �̿��� ���
		 * 2. 1.5������ for�� �̿��� ���N
		 * 3. Arrays.toString() �޼ҵ带 �̿��� ���
		 */
		
		
		System.out.println("< index�� �̿��� ��� >");
		for(int i =0 ; i < strArr.length ; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("< 1.5������ for���� �̿��� ��� >");
		for(String str : strArr) {
			System.out.println(str);
		}
		
		//Arrays.toString(�迭��);"[ù��°���, �ι�°���, ����°���, �׹������, ...]" Arrays.toString(�迭��)
		System.out.println("< Arrays.toString() �޼ҵ带 �̿��� ��� >");
		System.out.println(Arrays.toString(strArr));
	}

}
