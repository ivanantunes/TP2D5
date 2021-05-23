package Pizzaria;

import java.util.List;

public interface IPizza {

	public IPizza setId(int id);
	public int getId();
	
	public String getName();
	
	public IPizza setValue(double value);
	public double getValue();
	
	public IPizza setSize(String size);
	public String getSize();
	
	public IPizza addIIngredient(IIngredient ingredient);
	public IIngredient getIngredient(int id);
	
	public List<IIngredient> getIngredients();
}
