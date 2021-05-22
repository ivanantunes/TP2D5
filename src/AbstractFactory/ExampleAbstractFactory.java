package AbstractFactory;

public class ExampleAbstractFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IAnimal animal = (IAnimal) FactoryProvider.getFactory("Animal").create("Duck");
		
		System.out.println("Animal Name: " + animal.getAnimal());
		
	}

}
