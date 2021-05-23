package Pizzaria;

public class IngredientOnion implements IIngredient {

	private int id;
	private double amount;
	
	private IngredientOnion() { }
	
	public static IngredientOnion buildIngredientOnion() {
		return new IngredientOnion();
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
