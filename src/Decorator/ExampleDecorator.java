package Decorator;


public class ExampleDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IDecorator decorator1 = new Decorator1();
		
		System.out.println(decorator1.decorator());
		
		IDecorator decorator2 = new Decorator2(decorator1);
		
		System.out.println(decorator2.decorator());
		
		IDecorator decorator3 = new Decorator3(decorator2);
		
		System.out.println(decorator3.decorator());
		
		IDecorator decoratorFinal = new Decorator3(decorator3);
		
		System.out.println(decoratorFinal.decorator());
		
	}

}
