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
	}//printStar �޼ҵ� ���� / �޼ҵ� ������� : ���������ϰ� �ϱ�����
	
	
	/**
	 * ȣ���ڰ� �Ѱ��� �ΰ��� ������ ���޹޾�
	 * ���� 2���� ���� ����� ȣ���ڿ��� ����
	 * @param a ����1
	 * @param b ����2
	 * @return a*b ����1, ����2�� ���Ѱ�
	 */
	static int mul(int a, int b) {
		
		int result = a* b;
		return result;
	}

	public static void main(String[] args) {
		
		int data = mul(3, 5);
		System.out.println(data);
		
		printStar('*',10); //printStar �޼ҵ� ȣ�� / �޼ҵ��(); -> ȣ����
		System.out.println("Hello");
		printStar('!', 5);
		System.out.println("Hi");
		printStar('#',2);
		System.out.println("Good-Bye");
		printStar('$',15);
		
		
	}
}
