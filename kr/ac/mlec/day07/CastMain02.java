package kr.ac.mlec.day07;


/*
 	��ü����ȯ
 	���� : ���Կ�����(=)�� �������� �º��� �캯�� �ڷ����� ���� �ٸ���� �߻�
 	�������� : �º�, �캯�� �ڷ����� ���� ��Ӱ����� ��찡 ����
 	����
 	1) ����������ȯ
 	   �θ��� �ڷ��� = �ڽ��� �ڷ���
 	2) ���������ȯ
 	   �ڽ��� �ڷ��� = (�ڽ��ڷ���)�θ��� �ڷ���
 	   
 */
public class CastMain02 {
	
	public static void main(String[] args) {
		
//		Child01 c01 = (Child01) new Parent(); ����� ���ܹ߻�
		
		Parent p = new Child01();
		Child01 c01 = (Child01) p;
		
	}

}
