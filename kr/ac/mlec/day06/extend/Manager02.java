package kr.ac.mlec.day06.extend;

//상속이용

public class Manager02 extends Employee{
	
	Employee[] empList;
	
	public Manager02(int no, String name, int salary, String grade, Employee[] empList) {
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	public void info() {
		super.info(); // 부모 info 메소드 호출방법 : super + 부모 메소드명; 
		
		System.out.println("------------------------------------------------");
		System.out.println("\t\t< 관리사원 목록 >");
		System.out.println("------------------------------------------------");
		for(Employee emp :empList) {
			emp.info();
		}
		System.out.println("------------------------------------------------");
	}
	

}
