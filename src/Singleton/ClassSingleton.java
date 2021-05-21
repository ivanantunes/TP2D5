package Singleton;

public class ClassSingleton {

	private static ClassSingleton instance;
	
	private ClassSingleton() { }
	
	public static ClassSingleton getInstance() {
		if (ClassSingleton.instance == null) {
			ClassSingleton.instance = new ClassSingleton();
		}
		
		return ClassSingleton.instance;
	}
	
	public static void destroyInstance() {
		ClassSingleton.instance = null;
	}

}
