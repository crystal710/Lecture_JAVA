package kr.ac.mlec.day07;

public class DogMain {
	
	public static void main(String[] args) {
		
		Dog d = Dog.getInstance();
		Dog d2 = Dog.getInstance();
		Dog d3 = Dog.getInstance();
		
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d3);
	}

}
