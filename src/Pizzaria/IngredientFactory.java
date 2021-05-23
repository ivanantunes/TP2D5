package Pizzaria;

public class IngredientFactory {

	private IngredientFactory() { }
	
	public static IIngredient buildIgredient(EIngredientFlavor flavor) {
		
		switch (flavor) {
		
			case Tomato:
				return IngredientTomato.buildIngredientTomato();
			case Onion:
				return IngredientOnion.buildIngredientOnion();
			default:
				throw new Error("Ingrediente Inválido.");
		
		}
		
	}
	
}
