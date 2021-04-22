package kr.ac.mlec.day02.exam;

public class ExamMain08 {

	public static void main(String[] args) {
		
		for(int i = 1; i<= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print('*');
			}System.out.println();
		}
		
		System.out.println("--------------------");
		for(int i = 1; i <=5 ; i++) {
			for(int z =4; z >=i ; z--) {
				System.out.print(' ');
			}
			for(int j = 1; j <=i ; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= 6-i; j++) {
					System.out.print('*');
				}System.out.println();
			}else {
				for(int j=1 ;j <=i-4; j++) {
					System.out.print('*');
				}System.out.println();
			}
			
		}
		
		System.out.println("--------------------");
		
		for(int i = 0; i < 5 ; i++) {
			for(int j=5; j >=i ; j--) {
				System.out.print(' ');
			}
			for(int z = 1; z <=(i*2+1) ; z++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
