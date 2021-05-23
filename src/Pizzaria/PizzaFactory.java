package Pizzaria;

public class PizzaFactory {

	private PizzaFactory() { }
	
	public static IPizza buildPizza(EPizzaFlavor flavor) {
		
		switch (flavor) {

			case Pepperoni:
				return PizzaPepperoni.buildPizzaPepperoni();
			case Portuguese:
				return PizzaPortuguese.buildPizzaPortuguese();
			default:
				throw new Error("Sabor de Pizza Inválido.");
		
		}
		
	}
	
}
