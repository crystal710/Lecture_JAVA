package kr.ac.mlec.day03;

class Car{
	String name;
	int price;
}

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car(); //�������� : c
		c.name = "�̴�";
		c.price = 4000;
		
		Car c2 = new Car();
		c2.name = "�ҳ�Ÿ";
		c2.price = 3500;
		
		System.out.println("�ڵ��� �� : " + c.name + ", �ڵ��� ���� : " + c.price + "����"); //null�� ����Ű�� �ִ� �ʱⰪ�� ������ ���
		System.out.println("�ڵ��� �� : " + c2.name + ", �ڵ��� ���� : " + c2.price + "����"); 
		
	}
}
