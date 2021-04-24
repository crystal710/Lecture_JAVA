package kr.ac.mlec.day07;

public class Child02 extends Parent{

	public void play() {
		System.out.println("나는 놉니다");
	}
	
	public void sing() {
		System.out.println("나는 노래를 부릅니다");
	}
	
	@Override
	public void info() {
		System.out.println("Child02클래스에서 재정의된 메소드 호출...");
	}
	

}
