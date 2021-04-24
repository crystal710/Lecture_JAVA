package kr.ac.mlec.day06.extend2;

public class Employee {
	
	private int no;
	private String name;
	private int salary;
	private String grade;
	
	public Employee(){
		
	}
	
	public Employee(int no, String name, int salary, String grade) {
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	public void info() {
		System.out.println("사원번호 : " + no + ", 사원명 : " + name 
				+ ", 연봉 : " + salary + "만원, 직급 : " + grade);
	}

}
