package AbstractFactory;

public class ExampleAbstractFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IAnimal animal = (IAnimal) FactoryProvider.getFactory("Animal").create("Pato");
		
		System.out.println("Nome do Animal: " + animal.getAnimal());
		System.out.println("Som do Animal: " + animal.makeSound());
		
	}

}
