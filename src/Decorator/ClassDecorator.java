package Decorator;

public class ClassDecorator implements IDecorator {

	private IDecorator decorator;
	
	public ClassDecorator(IDecorator decorator) {
		this.decorator = decorator;
	}

	@Override
	public String decorator() {
		return decorator.decorator();
	}
}
