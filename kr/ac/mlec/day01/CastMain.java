package kr.ac.mlec.day01;

public class CastMain {

	public static void main(String[] args) {
		
		double a;
		
		a = 12; // double = int ������ �ȵǴ°� ���� double = double�̾���ϴµ� ��� int�� double�� ��ȯ ����ȯ
		//()���� �����ϸ� ������ ����ȯ double�� int���� ũ�⶧���� ������ ����ȯ�� �����ϴ�
		
		int b;
		b = (int)12.34; // int = double ����ȯ ��Ű�� ����� ����ȯ

		double c = 12 + 12.34;
		
		int d = (int)(12.34 + (double)5);
		
	}

}
