package kr.ac.mlec.day06.extend;

//����̿�

public class Manager03 extends Employee{
	
	Employee[] empList;
	
	public Manager03(int no, String name, int salary, String grade, Employee[] empList) {
		super(no, name, salary, grade);
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
