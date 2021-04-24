package kr.ac.mlec.day06.extend;

public class Manager01{
	int no;
	String name;
	int salary;
	String grade;
	Employee[] empList;
	
	public Manager01(int no, String name, int salary, String grade, Employee[] empList) {
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	public void info() {
		System.out.println("사원번호 : " + no + ", 사원명 : " + name 
				+ ", 연봉 : " + salary + "만원, 직급 : " + grade );
		
		System.out.println("------------------------------------------------");
		System.out.println("\t\t< 관리사원 목록 >");
		System.out.println("------------------------------------------------");
		for(Employee emp :empList) {
			emp.info();
		}
		System.out.println("------------------------------------------------");
	}

}
