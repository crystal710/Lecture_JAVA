package kr.ac.mlec.day02;

/*
 * 12345
 * 12345
 * 12345
 * 12345
 * 12345
 */

public class LoopMain04 {

	public static void main(String[] args) {
		
		for(int i = 1 ; i <=5 ; i++) { // 중첩된 for문, 이중 for문
			for(int j = 1 ; j <=5 ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
