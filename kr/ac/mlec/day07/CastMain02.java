package kr.ac.mlec.day07;


/*
 	객체형변환
 	정의 : 대입연산자(=)을 기준으로 좌변과 우변의 자료형이 서로 다른경우 발생
 	전제조건 : 좌변, 우변의 자료형은 서로 상속관계인 경우가 가능
 	종류
 	1) 묵시적형변환
 	   부모의 자료형 = 자식의 자료형
 	2) 명시적형변환
 	   자식의 자료형 = (자식자료형)부모의 자료형
 	   
 */
public class CastMain02 {
	
	public static void main(String[] args) {
		
//		Child01 c01 = (Child01) new Parent(); 실행시 예외발생
		
		Parent p = new Child01();
		Child01 c01 = (Child01) p;
		
	}

}
