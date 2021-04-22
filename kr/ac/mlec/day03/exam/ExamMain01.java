package kr.ac.mlec.day03.exam;

import java.util.Scanner;

/*
 * 정수 10개 입력받아 다음과 같이 실행되는 코드 작성
	실행예>
	1's num : 3
	2's num : 5
	3's num : 76
	4's num : 23
	5's num : 7698
	6's num : 23
	7's num : 7
	8's num : 34
	9's num : 11
	10's num : 57
	
	< PRINT 짝/홀 => 4/6>
	34 76 7698 34 57 11 7 23 5
 */

public class ExamMain01 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0 ; i<num.length; i++) {
			System.out.print((i+1) + "'s num : ");
			num[i] = sc.nextInt();
		}
		System.out.println();
		
		int even=0;
		int odd=0;
		int index=0;
		int index2=(num.length-1);
		
		for(int i=0; i<num.length ; i++) {
			if(num[i]%2 ==0) {
				num[index] = num[i];
				even++;
				index++;				
			}else {
				num[index2] = num[i];
				odd++;
				index2--;
			}
		}
		
		System.out.println("< PRINT 짝수/홀수 => " +even + "/"+ odd + " >");
		for(int i = 0; i<num.length;i++) {
		System.out.print(num[i] + " ");
		}
	}
}
