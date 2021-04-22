package kr.ac.mlec.day04;

/*
	**********
	hello
	**********
	hi
	**********
	good-bye
	**********
 
 */

public class MethodMain01 {
	
	static void printStar(char shape,int count){
		
		for(int i=0; i<count ;i++) {
			System.out.print(shape);
		}System.out.println();
		
		//System.out.println("**********");
	}//printStar 메소드 선언 / 메소드 사용이유 : 수정용이하게 하기위해
	
	
	/**
	 * 호출자가 넘겨준 두개의 정수를 전달받아
	 * 정수 2개의 곱한 결과를 호출자에게 전달
	 * @param a 정수1
	 * @param b 정수2
	 * @return a*b 정수1, 정수2의 곱한값
	 */
	static int mul(int a, int b) {
		
		int result = a* b;
		return result;
	}

	public static void main(String[] args) {
		
		int data = mul(3, 5);
		System.out.println(data);
		
		printStar('*',10); //printStar 메소드 호출 / 메소드명(); -> 호출방법
		System.out.println("Hello");
		printStar('!', 5);
		System.out.println("Hi");
		printStar('#',2);
		System.out.println("Good-Bye");
		printStar('$',15);
		
		
	}
}
