package kr.ac.mlec.day07;

public class Child01 extends Parent{

	public void study() {
		System.out.println("���� ���θ� �մϴ�");
	}
	
	public void sleep() {
		System.out.println("���� ���� ��ϴ�.");
	}
	
	@Override
	public void info() {
		System.out.println("Child01���� �������̵��� �޼ҵ�...");
	}

}
