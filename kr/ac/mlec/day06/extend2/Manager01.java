package kr.ac.mlec.day06.extend2;


public class Manager01 extends Employee {
	
	private Employee[] empList;
	
	public Manager01() {
		
	}
	
	public Manager01 (int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
		this.empList = empList;
	}
	
	@Override
	public void info() {
		super.info();
		
		System.out.println("------------------------------------------------");
		System.out.println("\t\t< 관리사원 목록 >");
		System.out.println("------------------------------------------------");
		for(Employee emp :empList) {
			emp.info();
		}
		System.out.println("------------------------------------------------");
		
		
	}

}
