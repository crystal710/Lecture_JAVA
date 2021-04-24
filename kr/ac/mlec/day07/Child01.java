package kr.ac.mlec.day07;

public class Child01 extends Parent{

	public void study() {
		System.out.println("나는 공부를 합니다");
	}
	
	public void sleep() {
		System.out.println("나는 잠을 잡니다.");
	}
	
	@Override
	public void info() {
		System.out.println("Child01에서 오버라이딩된 메소드...");
	}

}
