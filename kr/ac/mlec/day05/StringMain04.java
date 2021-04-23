package kr.ac.mlec.day05;

public class StringMain04 {
	
	public static void main(String[] args) {
		
		String str = new String ("hello");
		String str2 = new String("hello");
		
		System.out.println("str : [" + str + "]");
		System.out.println("str2 : [" + str2 + "]");
		
		
		//참조변수 비교
		if(str == str2) {
			System.out.println("주소비교 str == str2");
		}else {
			System.out.println("주소비교 str != str2");
		}
		
		//문자열 비교
		boolean bool = str.equals(str2);
		if(bool) {
			System.out.println("문자열비교 str == str2");
		}else {
			System.out.println("문자열비교 str != str2");
		}
		
		System.out.println("hello.equal(Hello) : " + "hello".equals("Hello"));
		System.out.println("hello.equal(Hello) : " + "hello".equalsIgnoreCase("Hello"));
		
		System.out.println(str.startsWith("h")? "h로 시작합니다" : "h로 시작하지 않습니다");
		System.out.println("Hello".startsWith("h")? "h로 시작합니다" : "h로 시작하지 않습니다");
		
		String[] names = {"홍길동","강길동","홍길순","김홍길","윤길순","홍길동"};
		System.out.println("< 전체 회원 리스트 > ");
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("< 회원명이 \"홍길동\"인 회원 출력 >");
		for(String name : names) {
			if(name.equals("홍길동"))
				System.out.println(name);
		}
		
		System.out.println("< \"홍\"씨 성을 가진 회원 출력 >");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름이\"길동\"인 회원 출력 >");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
			
		System.out.println("< 이름이\"길동\"인 회원 출력 >");
		for(int i = 0; i< names.length; i++) {
			if(names[i].endsWith("길동")) {
				System.out.println(names[i]);
			}
		}
		
		System.out.println("< \"홍\"이 포함된 회원 출력 >");
		for(String name : names) {
			if(name.contains("홍")) { //중간에 포함되어있는 것도 추출가능
				System.out.println(name);
			}
		}
		
//		str = "banana";
		str = "board";
		str2 = "boat";
		
		int compare = str.compareTo(str2); //compareTo : 같은 값인지 파악 정렬같은거 할때 주로 사용
		if(compare ==0) {
			System.out.println(str + " == " + str2);
		}else if(compare > 0) {
			System.out.println(str2 + " < " + str);
		}else {
			System.out.println(str + " < " + str2);
		}
		
		str = "hello world";
		System.out.println("str : ["+str+"]");
		int index = str.indexOf('o');
		System.out.println("indexOf(\"o\") : " +index);
		
		index = str.lastIndexOf('o');
		System.out.println("lastIndexOf(\"o\") : " +index);
		
		index = str.indexOf('p');
		System.out.println("indexOf(\"p\") : " +index); //없는 문자열일땐 -1을 리턴
		
		System.out.println("< \"l\"의 모든 위치 출력 >");
		index = str.indexOf('l');
		while(index != -1) {
			System.out.println(index+ "번지에 \'l\' 존재");
			index = str.indexOf('l', index+1);
		}
		
		
	}

}
