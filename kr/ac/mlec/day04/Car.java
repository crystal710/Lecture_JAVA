package kr.ac.mlec.day04;

public class Car {
	
	String name;
	int price;
	
	void print() {
		System.out.println("자동차명 : " + name + ", 자동차 가격 : " + price + "만원");
		
	}

	void init(String name, int price) {

		this.name = name;
		this.price = price;
		
	}

}
