package kr.ac.mlec.day05;

public class DogMain {
	
	public static void main(String[] args) {
		//�Ӳ�, Ǫ��
		
		Dog d = new Dog("�Ӳ�","Ǫ��");
		
		d.setName("��");
		
		System.out.println("�̸� : " + d.getName());
		System.out.println("���� : " + d.getType());
		
		System.out.println("d : "+ d.toString());
	}

}
