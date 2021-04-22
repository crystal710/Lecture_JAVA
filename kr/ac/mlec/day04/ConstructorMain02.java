package kr.ac.mlec.day04;

class Member{
	String name;
	int age;
	String bloodType;
	
	Member(){
		name = "알수없음";
		bloodType = "알수없음";
	}
	
	Member(String name){
		this(name, 0 ,"알수없음"); //this 생성자 : 생성자의 맨 처음에 사용해야한다, 생성자 호출시 사용가능 new로 인스턴스 객체 만들필요없음 
	}
	
	Member(String name, int age, String bloodType){
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("이름 : " + name + ", 나이 : " +age + ", 혈액형 : "+ bloodType + "형");
	}
}

public class ConstructorMain02 {

	public static void main(String[] args) {
//		Member[] list = new Member[3];
		
		Member[] list = {new Member("홍길동",25,"O"),
						 new Member("윤길동",20,"A"),
						 new Member("박길동",17,"AB")};
		
		for(Member mem : list) {
			mem.info();
		}
		
		/*
//		Member m = new Member();
		Member m = new Member("홍길동",25,"O");
		Member m2 = new Member("윤길동",20,"A");
		Member m3= new Member("박길동",17,"AB");
		
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
