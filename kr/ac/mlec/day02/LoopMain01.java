package kr.ac.mlec.day02;

/*
 * 반복문을 위한 요소 4가지
 * 1. 실행할 문장
 * 2. 초기값
 * 3. 증가/감소
 * 4. 종료조건
 * 
 * 초기값
 	while(종료 조건){
 		실행할 문장 
 		증가/감소
 	}
 */
public class LoopMain01 {

	public static void main(String[] args) {
		
		int cnt = 0;
		while (cnt < 5) {
			System.out.println("Hello");
			cnt++;
		}
	}
}
