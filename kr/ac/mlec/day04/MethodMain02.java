package kr.ac.mlec.day04;

//실행클래스
public class MethodMain02 {

	public static void main(String[] args) {
		
		Method m = new Method(); //누구한테 시킬 인스턴스 객체를 만들어야해
		m.call();
		m.call(1);
		m.call(2.4);
		m.call("Hello");
		
		
	}
	
}
