package kr.ac.mlec.day04;

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car();
		c.init("�ҳ�Ÿ", 3200);
//		c.name = "�ҳ�Ÿ";
//		c.price =3200;
		
		c.print();
		
		Car c2 = new Car();
		c2.init("�̴�", 5000);
//		c2.name="�̴�";
//		c2.price = 5000;
		
		c2.print();
	}
}
