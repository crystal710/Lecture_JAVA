package kr.ac.mlec.day04.exam;

/*
	�����Է½�.... ������ ���� �ڵ� �ۼ�
	
	int no = sc.nextInt();
	sc.nextLine();
	
	int no2 = sc.nextInt();
	sc.nextLine();
	
	int no3 = Integer.parseInt(sc.nextLine());

	���̽�ũ�� � �����ҷ�?  3
	
	*** 1��° ���̽�ũ�� �������� �Է� ***
	���̽�ũ���� : ����
	���̽�ũ������ : 800
	
	*** 2��° ���̽�ũ�� �������� �Է� ***
	���̽�ũ���� : ������
	���̽�ũ������ : 2000
	
	*** 3��° ���̽�ũ�� �������� �Է� ***
	���̽�ũ���� : ������
	���̽�ũ������ : 1200
	
	< 3���� ���̽�ũ�� �������� ��� >
	��ȣ   ���̽�ũ����   ���̽�ũ������
	1		����		800
	2		������		2000
	3		������		1200
	
*/

public class IceCreamMain {
	
	public static void main(String[] args) {
		
		IceCream ice = new IceCream();
		
		ice.getIce();
		
		ice.print();
	}

}
