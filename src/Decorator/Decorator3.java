package Decorator;

public class Decorator3 extends ClassDecorator {

	public Decorator3(IDecorator decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public String decorator() {
		return super.decorator() + " Docorator3";
	}

}
