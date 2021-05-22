package AbstractFactory;

public class AnimalFactory implements IAbstractFactory<IAnimal> {

	@Override
	public IAnimal create(String animalType) {
		// TODO Auto-generated method stub

		if (animalType.equals("Duck")) {
			return new Duck();
		}
		
		throw new Error("Animal Type Invalid");

	}

}
