package kr.ac.mlec.day06.extend;

public class ExtendsMain02 {
	
	public static void main(String[] args) {
		
		Employee e = new Employee(1, "홍길동", 3500,"사원");
		Employee e2 = new Employee(2, "김길동", 4200,"대리");
		Employee e3 = new Employee(3, "박길동", 2300,"인턴");
		Employee e4 = new Employee(4, "권길동", 5400,"과장");
		Employee e5 = new Employee(5, "한길동", 5500,"과장");
		
		e.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		
		Employee[] empList = {e, e3, e4};
	
		//Manager01 m = new Manager01(100, "나캡틴" , 8000, "부장", empList);
//		Manager02 m = new Manager02(100, "나캡틴" , 8000, "부장", empList);
		Manager03 m = new Manager03(100, "나캡틴" , 8000, "부장", empList);
		m.info();
	}

}
