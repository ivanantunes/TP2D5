package AbstractFactory;

public class AnimalFactory implements IAbstractFactory<IAnimal> {

	@Override
	public IAnimal create(String animalType) {
		// TODO Auto-generated method stub

		if (animalType.equals("Pato")) {
			return new Duck();
		}
		
		throw new Error("Tipo de Animal Inválido.");

	}

}
