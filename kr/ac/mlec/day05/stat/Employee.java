package kr.ac.mlec.day05.stat;

public class Employee {

	String name;
	int salary;
	String grade;
	static int totalEmployee; //�ѻ����
	
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
		System.out.println("����� : " + name+", ���� : " + salary+"����, ���� : " + grade);
	}
	
	static void totalEmployeeInfo() {
		System.out.println("�� ����� : "+ Employee.totalEmployee +"��");
	}
	
}
