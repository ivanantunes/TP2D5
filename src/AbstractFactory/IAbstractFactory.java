package AbstractFactory;

public interface IAbstractFactory<T> {

	T create(String animalType);
	
}
