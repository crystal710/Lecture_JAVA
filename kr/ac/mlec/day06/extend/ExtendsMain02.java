package kr.ac.mlec.day06.extend;

public class ExtendsMain02 {
	
	public static void main(String[] args) {
		
		Employee e = new Employee(1, "ȫ�浿", 3500,"���");
		Employee e2 = new Employee(2, "��浿", 4200,"�븮");
		Employee e3 = new Employee(3, "�ڱ浿", 2300,"����");
		Employee e4 = new Employee(4, "�Ǳ浿", 5400,"����");
		Employee e5 = new Employee(5, "�ѱ浿", 5500,"����");
		
		e.info();
		e2.info();
		e3.info();
		e4.info();
		e5.info();
		
		Employee[] empList = {e, e3, e4};
	
		//Manager01 m = new Manager01(100, "��ĸƾ" , 8000, "����", empList);
//		Manager02 m = new Manager02(100, "��ĸƾ" , 8000, "����", empList);
		Manager03 m = new Manager03(100, "��ĸƾ" , 8000, "����", empList);
		m.info();
	}

}
