package kr.ac.mlec.day03;

public class LoopMain04 {

	public static void main(String[] args) {
		
		one: for(int i = 1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print('*');
				
				if(j==i) {
					break one;//break영향 끼치는건 switch문과 반복문에 영향끼침
				}//분기문 / 자바에서 이름을 지정해서 반복문 break가 가능하다
			}

			System.out.println();
		}
		
	}
}
