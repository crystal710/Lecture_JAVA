package kr.ac.mlec.day03;

public class ArrayMain01 {

	public static void main(String[] args) {
		
		//정수를 5개 저장하는 배열 iArr 생성
		
		int[] iArr;
		iArr = new int[5];
		
		System.out.println("배열크기 : " + iArr.length);
		
		for(int i = 0; i<iArr.length; i++) {
			System.out.println(i+ "번째 정수 : " + iArr[i]);
		}
		
		/*
		System.out.println("첫번째 정수 : " + iArr[0]);
		System.out.println("두번째 정수 : " + iArr[1]);
		System.out.println("세번째 정수 : " + iArr[2]);
		System.out.println("네번째 정수 : " + iArr[3]);
		System.out.println("다섯번째 정수 : " + iArr[4]);
		
		*/
		
		/*
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		iArr[3] = 40;
		iArr[4] = 50;
		*/
		
//		for(int i =0; i<iArr.length; i++) {
//			iArr[i] = 10 * (i+1);
//		}
		
		for(int i =0; i<iArr.length ; i++) {
			iArr[i] = 10 * (i+1);
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		
		for(int num : iArr) { //집합이면 모두 사용가능한 1.5 for문
			System.out.print(num + " ");
		}
	}
}
