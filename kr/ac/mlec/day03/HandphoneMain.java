package kr.ac.mlec.day03;

public class HandphoneMain {

	public static void main(String[] args) {
		
		//이름 : 홍길동, 전화번호 : 010-1111-2222, 제조사 : 삼성인 핸드폰객체 hp 생성
		Handphone hp = new Handphone();
		
		hp.name = "홍길동";
		hp.phone = "010-1111-2222";
		hp.company = "삼성";
		
		Handphone hp2 = new Handphone();
		
		hp2.name="윤길동";
		hp2.phone = "010-3333-4444";
		hp2.company = "엘지";
		
		Handphone hp3 = new Handphone();
		
		hp3.name = "박길동";
		hp3.phone = "010-5555-6666";
		hp3.company = "애플";
		
		System.out.println("이름 : " + hp.name + " , 전화번호 : " + hp.phone + " , 제조사 : " + hp.company );
		System.out.println("이름 : " + hp2.name + " , 전화번호 : " + hp2.phone + " , 제조사 : " + hp2.company );
		System.out.println("이름 : " + hp3.name + " , 전화번호 : " + hp3.phone + " , 제조사 : " + hp3.company );
		
		Handphone[] hpArr = {hp, hp2, hp3};
		
		for(int i=0; i < hpArr.length ; i++) {

			System.out.println("소유주명 : " + hpArr[i].name + ", 전화번호 : " +hpArr[i].phone + ", 제조사 : " +hpArr[i].company);
		}
		
		for(Handphone data : hpArr) {
			System.out.println(data.name + " " + data.phone + " " + data.company);
		}
	}
}





