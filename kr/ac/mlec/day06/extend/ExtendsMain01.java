package kr.ac.mlec.day06.extend;

class One {
	
	public One() {
		System.out.println("One() 생성자 호출...");
	}
}

class Two extends One{
	
	public Two() {
		System.out.println("Two() 생성자 호출...");
	}
}

class Three extends Two{
	public Three() {
		System.out.println("Three() 생성자 호출...");
	}
}

public class ExtendsMain01 {
	
	public static void main(String[] args) {
		
//		new One();
//		new Two();
		new Three();
		
		
	}

}
