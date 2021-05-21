package MethodFactory;

public class MethodFactory {

	public static ClassGeneric getClassGeneric() {
		System.out.println("Fabricando uma Classe Generica");
		return new ClassGeneric();
	}
	
}
