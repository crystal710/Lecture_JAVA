package kr.ac.mlec.day04;

/*
 	������ Ư¡
 	1. Ŭ������� �̸��� ����
 	2. ��ȯ�� ����x
 	3. �����ε� ����
 	4. ������ ��ü�� ������� �ʱ�ȭ
 */
public class Dog {

	Dog(){
		System.out.println("����Ʈ ������ Dog() ȣ��...");
	}
	
	Dog(String name){
		System.out.println("Dog(String) ȣ��...");
	}
	
	Dog(int age, String name){
		System.out.println("Dog(int, Sring) ������ ȣ��...");
	}
	
	void Dog(){
		System.out.println("Dog() �޼ҵ� ȣ��...");
	}
	
}
