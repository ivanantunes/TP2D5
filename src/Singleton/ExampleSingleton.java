package Singleton;

public class ExampleSingleton {

	public static void main(String[] args) {
	
		ClassSingleton sing1 = ClassSingleton.getInstance();
		ClassSingleton sing2 = ClassSingleton.getInstance();
		
		if (sing1 == sing2) {
			System.out.println("A Instancia das Classes São Iguais.");
		} else {
			System.out.println("A Instancia das Classes São Diferentes.");
		}
		
	}

}
