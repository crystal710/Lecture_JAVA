package kr.ac.mlec.day04;

class Member{
	String name;
	int age;
	String bloodType;
	
	Member(){
		name = "�˼�����";
		bloodType = "�˼�����";
	}
	
	Member(String name){
		this(name, 0 ,"�˼�����"); //this ������ : �������� �� ó���� ����ؾ��Ѵ�, ������ ȣ��� ��밡�� new�� �ν��Ͻ� ��ü �����ʿ���� 
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("�̸� : " + name + ", ���� : " +age + ", ������ : "+ bloodType + "��");
	}
}

public class ConstructorMain02 {

	public static void main(String[] args) {
//		Member[] list = new Member[3];
		
		Member[] list = {new Member("ȫ�浿",25,"O"),
						 new Member("���浿",20,"A"),
						 new Member("�ڱ浿",17,"AB")};
		
		for(Member mem : list) {
			mem.info();
		}
		
		/*
//		Member m = new Member();
		Member m = new Member("ȫ�浿",25,"O");
		Member m2 = new Member("���浿",20,"A");
		Member m3= new Member("�ڱ浿",17,"AB");
		
		Member[] list = {m, m2, m3};
		
		for(Member mem : list) {
			mem.info();
		}
		
		/*
		 for(int i = 0 ; i<list.length; i++) {
			list[i].info();
		}
		*/
		
	}
}
