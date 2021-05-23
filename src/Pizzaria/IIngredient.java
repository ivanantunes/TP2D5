package Pizzaria;

public interface IIngredient {

	public IIngredient setId(int id);
	public int getId();
	
	public String getName();
	
	public IIngredient setAmount(double amount);
	public double getAmount();
	
}
