package kr.ac.mlec.day03;

class Car{
	String name;
	int price;
}

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car(); //참조변수 : c
		c.name = "미니";
		c.price = 4000;
		
		Car c2 = new Car();
		c2.name = "소나타";
		c2.price = 3500;
		
		System.out.println("자동차 명 : " + c.name + ", 자동차 가격 : " + c.price + "만원"); //null은 가리키고 있는 초기값이 없을때 사용
		System.out.println("자동차 명 : " + c2.name + ", 자동차 가격 : " + c2.price + "만원"); 
		
	}
}
