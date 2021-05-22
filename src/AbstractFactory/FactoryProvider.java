package AbstractFactory;

public class FactoryProvider {

	public static IAbstractFactory<?> getFactory(String choice) {
		
		if ("Animal".equals(choice)) {
			return new AnimalFactory();
		}

		throw new Error("Fabrica Inválida.");
	}
	
}
