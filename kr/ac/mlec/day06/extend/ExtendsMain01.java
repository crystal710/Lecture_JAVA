package kr.ac.mlec.day06.extend;

class One {
	
	public One() {
		System.out.println("One() ������ ȣ��...");
	}
}

class Two extends One{
	
	public Two() {
		System.out.println("Two() ������ ȣ��...");
	}
}

class Three extends Two{
	public Three() {
		System.out.println("Three() ������ ȣ��...");
	}
}

public class ExtendsMain01 {
	
	public static void main(String[] args) {
		
//		new One();
//		new Two();
		new Three();
		
		
	}

}
