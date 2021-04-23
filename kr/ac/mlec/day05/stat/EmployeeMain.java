package kr.ac.mlec.day05.stat;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
//		Employee.totalEmployeeInfo();
		
		
		Employee e = new Employee("홍길동", 3_200, "사원");
		Employee e2 = new Employee("강길동", 3_500,"주임");
		Employee e3 = new Employee("윤길동", 4_000,"대리");
//		Employee e4 = new Employee("김길동", 4_000,"대리");
		
		e.info();
		e2.info();
		e3.info();
		
//		Employee.totalEmployeeInfo();
		
	}

}
