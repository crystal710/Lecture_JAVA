package kr.ac.mlec.day04;

public class Car {
	
	String name;
	int price;
	
	void print() {
		System.out.println("�ڵ����� : " + name + ", �ڵ��� ���� : " + price + "����");
		
	}

	void init(String name, int price) {

		this.name = name;
		this.price = price;
		
	}

}
