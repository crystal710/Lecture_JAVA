package kr.ac.mlec.day03;

public class LoopMain04 {

	public static void main(String[] args) {
		
		one: for(int i = 1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print('*');
				
				if(j==i) {
					break one;//break���� ��ġ�°� switch���� �ݺ����� ���Ⳣħ
				}//�б⹮ / �ڹٿ��� �̸��� �����ؼ� �ݺ��� break�� �����ϴ�
			}

			System.out.println();
		}
		
	}
}
