package kr.ac.mlec.day07;

public class Dog {//Singleton Pattern
	
	private static Dog obj;
	
	private Dog() {
		
	}
	
	public static Dog getInstance() {
		if(obj == null) {
			obj = new Dog();
		}
		return obj;
	}

}
