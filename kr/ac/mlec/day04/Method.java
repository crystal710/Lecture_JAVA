package kr.ac.mlec.day04;

/*
 	메소드 오버로딩(Overloading)
 	클래스내에 메소드명이 같으면서 파라미터의 개수나 타입이 다른것
 */

// char < int < long < float < double  -> 가장 가까운 자료형으로 ]묵시적 형변환이 가능

//참조클래스
public class Method {

	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(String s) {
		System.out.println("call(" + s + ") 메소드 호출");
	}
	
}
