package kr.ac.mlec.day04;

/*
 	�޼ҵ� �����ε�(Overloading)
 	Ŭ�������� �޼ҵ���� �����鼭 �Ķ������ ������ Ÿ���� �ٸ���
 */

// char < int < long < float < double  -> ���� ����� �ڷ������� ]������ ����ȯ�� ����

//����Ŭ����
public class Method {

	void call() {
		System.out.println("call() �޼ҵ� ȣ��...");
	}
	
	void call(int i) {
		System.out.println("call(int) �޼ҵ� ȣ��...");
	}
	
	void call(double d) {
		System.out.println("call(double) �޼ҵ� ȣ��...");
	}
	
	void call(String s) {
		System.out.println("call(" + s + ") �޼ҵ� ȣ��");
	}
	
}
