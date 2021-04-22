package kr.ac.mlec.day04;

/*
 	생성자 특징
 	1. 클래스명과 이름이 동일
 	2. 반환형 존재x
 	3. 오버로딩 지원
 	4. 생성시 객체의 멤버변수 초기화
 */
public class Dog {

	Dog(){
		System.out.println("디폴트 생성자 Dog() 호출...");
	}
	
	Dog(String name){
		System.out.println("Dog(String) 호출...");
	}
	
	Dog(int age, String name){
		System.out.println("Dog(int, Sring) 생성자 호출...");
	}
	
	void Dog(){
		System.out.println("Dog() 메소드 호출...");
	}
	
}
