package kr.ac.mlec.day07;

public class CastMain01 {
	
	/*
	public static void print(Child01 c) {
		c.info();
	}
	
	public static void print(Child02 c) {
		c.info();
	}*/
	
	public static void print(Parent p) {
		
//		System.out.println("p instanceof Child01" + (p instanceof Child01));
//		System.out.println("p instanceof Child02" + (p instanceof Child02));
//		System.out.println("p instanceof Parent" + (p instanceof Parent));
		
		p.info();
		if(p instanceof Child01) {
			Child01 c01 = (Child01)p;
			c01.sleep();
			c01.study();
		} else if(p instanceof Child02) {
			Child02 c02 = (Child02)p;
			c02.sing();
			c02.play();
		}
		
		
//		p.info();
//		
//		Child01 c= (Child01)p; //명시적 형변환 실행
//		c.study();
//		c.sleep();
	}
	
	public static void main(String[] args) {
		
//		Parent p = ParentFactory.getInstance(); //return으로 묵시적 형변환이 가능
//		p.info();
		
	
		Child01 c01 = new Child01();
		print(c01);
		
		Child02 c02 = new Child02();
		print(c02);
		
		Parent p = new Parent();
		print(p);
		
		/*
		Parent p = new Child01();
		p.info();
		
		p = new Child02();
		p.info();
		
		p = new Parent();
		p.info();
		
		/*
		Parent p = new Parent();
		p.info();
		
		Child01 c01 = new Child01();
		c01.info();
		c01.study();
		c01.sleep();
		
		Child02 c02 = new Child02();
		c02.info();
		c02.play();
		c02.sing();
		*/
		
	}

}
