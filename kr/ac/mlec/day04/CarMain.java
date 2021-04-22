package kr.ac.mlec.day04;

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car();
		c.init("소나타", 3200);
//		c.name = "소나타";
//		c.price =3200;
		
		c.print();
		
		Car c2 = new Car();
		c2.init("미니", 5000);
//		c2.name="미니";
//		c2.price = 5000;
		
		c2.print();
	}
}
