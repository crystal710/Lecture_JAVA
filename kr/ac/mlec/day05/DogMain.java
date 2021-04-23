package kr.ac.mlec.day05;

public class DogMain {
	
	public static void main(String[] args) {
		//¾Ó²¿, Çªµé
		
		Dog d = new Dog("¾Ó²¿","Çªµé");
		
		d.setName("Âð»§");
		
		System.out.println("ÀÌ¸§ : " + d.getName());
		System.out.println("Á¾·ù : " + d.getType());
		
		System.out.println("d : "+ d.toString());
	}

}
