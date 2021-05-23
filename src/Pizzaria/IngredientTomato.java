package Pizzaria;

public class IngredientTomato implements IIngredient {

	private int id;
	private double amount;
	
	private IngredientTomato() { }
	
	public static IngredientTomato buildIngredientTomato() {
		return new IngredientTomato();
	}
	
	@Override
	public IIngredient setId(int id) {
		this.id = id;
		return this;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public String getName() {
		return "Tomate";
	}

	@Override
	public IIngredient setAmount(double amount) {
		this.amount = amount;
		return this;
	}

	@Override
	public double getAmount() {
		return this.amount;
	}

}
