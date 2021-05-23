package ProjectDefaults;

public class ThreadBuilder {

	private String name = "";
	
	private ThreadBuilder() {
		
	}
	
	public static ThreadBuilder build() {
		return new ThreadBuilder();
	}
	
	public ThreadBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public String getName() {
		return this.name;
	}
	
}
