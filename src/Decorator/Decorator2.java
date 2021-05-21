package Decorator;

public class Decorator2 extends ClassDecorator {

	public Decorator2(IDecorator decorator) {
		super(decorator);
		// TODO Auto-generated constructor stub
	}
	
	public String decorator() {
		return super.decorator() + " Docorator2";
	}

}
