package kr.ac.mlec.day04.exam;

/*
	정수입력시.... 다음과 같이 코드 작성
	
	int no = sc.nextInt();
	sc.nextLine();
	
	int no2 = sc.nextInt();
	sc.nextLine();
	
	int no3 = Integer.parseInt(sc.nextLine());

	아이스크림 몇개 구입할래?  3
	
	*** 1번째 아이스크림 구매정보 입력 ***
	아이스크림명 : 비비빅
	아이스크림가격 : 800
	
	*** 2번째 아이스크림 구매정보 입력 ***
	아이스크림명 : 월드콘
	아이스크림가격 : 2000
	
	*** 3번째 아이스크림 구매정보 입력 ***
	아이스크림명 : 구구바
	아이스크림가격 : 1200
	
	< 3개의 아이스크림 구매정보 출력 >
	번호   아이스크림명   아이스크림가격
	1		비비빅		800
	2		월드콘		2000
	3		구구바		1200
	
*/

public class IceCreamMain {
	
	public static void main(String[] args) {
		
		IceCream ice = new IceCream();
		
		ice.getIce();
		
		ice.print();
	}

}
