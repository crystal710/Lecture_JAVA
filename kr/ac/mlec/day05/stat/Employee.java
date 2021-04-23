package kr.ac.mlec.day05.stat;

public class Employee {

	String name;
	int salary;
	String grade;
	static int totalEmployee; //총사원수
	
	Employee(){
		
	}
	
	Employee(String name, int salary, String grade){
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		
		Employee.totalEmployee++;
		
		Employee.totalEmployeeInfo();
	}
	
	void info() {
		System.out.println("사원명 : " + name+", 연봉 : " + salary+"만원, 직급 : " + grade);
	}
	
	static void totalEmployeeInfo() {
		System.out.println("총 사원수 : "+ Employee.totalEmployee +"명");
	}
	
}
