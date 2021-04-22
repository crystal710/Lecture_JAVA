package kr.ac.mlec.day04;

public class GugudanMain {

	public static void main(String[] args) {
		
		Gugudan gu = new Gugudan();
		
		/*
		 * 2-9 사이 단 입력 : 5
		 	***5단***
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
		 	시작단 : 5
		 	종료단 : 7
		 	
		 	*** 5단 ***
		 	...
		 	7*9 = 63
		 */
		
//		System.out.println("시작단 : ");
//		int startDan = gu.getDan();
//		System.out.println("종료단 : ");
//		int endDan = gu.getDan();/66
		
		int startDan = gu.getDan("시작단 : ");
		int endDan = gu.getDan("종료단 : ");
		
		gu.print(startDan , endDan);
		
	}
	
}
