package kr.ac.mlec.day06.extend;

//����̿�

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
		super.info(); // �θ� info �޼ҵ� ȣ���� : super + �θ� �޼ҵ��; 
		
		System.out.println("------------------------------------------------");
		System.out.println("\t\t< ������� ��� >");
		System.out.println("------------------------------------------------");
		for(Employee emp :empList) {
			emp.info();
		}
		System.out.println("------------------------------------------------");
	}
	

}
