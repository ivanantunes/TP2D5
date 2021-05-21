package Builder;

public class ClassBuilder {

	private ClassBuilder() { }
	
	public static ClassBuilder builder() {
		System.out.println("Contruindo um Builder");
		
		return new ClassBuilder();
	}
	
}
