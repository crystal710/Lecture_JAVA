package kr.ac.mlec.day02;

import java.util.Scanner;

/*
 * 1 -3 ������ ������ �Է� : 1
 * ON
 * 
 * 1�Է½� ONE ���
 * 2�Է½� TWO ���
 * 3�Է½� THREE ���
 * �ƴ϶�� ERROR ���
 */

public class IFMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1-3 ������ ������ �Է� : ");
		int num = sc.nextInt();
		
		if(num ==1) {
			System.out.println("ONE");
		} else if(num == 2) {
			System.out.println("TWO");
		} else if(num == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("ERROR");
		}
		
		
	}
}
