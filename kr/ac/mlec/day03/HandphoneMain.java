package kr.ac.mlec.day03;

public class HandphoneMain {

	public static void main(String[] args) {
		
		//�̸� : ȫ�浿, ��ȭ��ȣ : 010-1111-2222, ������ : �Ｚ�� �ڵ�����ü hp ����
		Handphone hp = new Handphone();
		
		hp.name = "ȫ�浿";
		hp.phone = "010-1111-2222";
		hp.company = "�Ｚ";
		
		Handphone hp2 = new Handphone();
		
		hp2.name="���浿";
		hp2.phone = "010-3333-4444";
		hp2.company = "����";
		
		Handphone hp3 = new Handphone();
		
		hp3.name = "�ڱ浿";
		hp3.phone = "010-5555-6666";
		hp3.company = "����";
		
		System.out.println("�̸� : " + hp.name + " , ��ȭ��ȣ : " + hp.phone + " , ������ : " + hp.company );
		System.out.println("�̸� : " + hp2.name + " , ��ȭ��ȣ : " + hp2.phone + " , ������ : " + hp2.company );
		System.out.println("�̸� : " + hp3.name + " , ��ȭ��ȣ : " + hp3.phone + " , ������ : " + hp3.company );
		
		Handphone[] hpArr = {hp, hp2, hp3};
		
		for(int i=0; i < hpArr.length ; i++) {

			System.out.println("�����ָ� : " + hpArr[i].name + ", ��ȭ��ȣ : " +hpArr[i].phone + ", ������ : " +hpArr[i].company);
		}
		
		for(Handphone data : hpArr) {
			System.out.println(data.name + " " + data.phone + " " + data.company);
		}
	}
}





