package kr.ac.mlec.day04;

public class GugudanMain {

	public static void main(String[] args) {
		
		Gugudan gu = new Gugudan();
		
		/*
		 * 2-9 ���� �� �Է� : 5
		 	***5��***
		 	5*1=5
		 	...
		 	5*9=45
		 */
//		System.out.print("2 - 9 : ");
//		int dan = gu.getDan();
		
		int dan = gu.getDan("2 - 9 : ");
		
		gu.print(dan);
		System.out.println();
		
		gu.print();
		
		/*
		 	���۴� : 5
		 	����� : 7
		 	
		 	*** 5�� ***
		 	...
		 	7*9 = 63
		 */
		
//		System.out.println("���۴� : ");
//		int startDan = gu.getDan();
//		System.out.println("����� : ");
//		int endDan = gu.getDan();/66
		
		int startDan = gu.getDan("���۴� : ");
		int endDan = gu.getDan("����� : ");
		
		gu.print(startDan , endDan);
		
	}
	
}
