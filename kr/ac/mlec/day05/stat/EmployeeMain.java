package kr.ac.mlec.day05.stat;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
//		Employee.totalEmployeeInfo();
		
		
		Employee e = new Employee("ȫ�浿", 3_200, "���");
		Employee e2 = new Employee("���浿", 3_500,"����");
		Employee e3 = new Employee("���浿", 4_000,"�븮");
//		Employee e4 = new Employee("��浿", 4_000,"�븮");
		
		e.info();
		e2.info();
		e3.info();
		
//		Employee.totalEmployeeInfo();
		
	}

}
