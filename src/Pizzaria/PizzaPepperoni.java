package Pizzaria;

import java.util.ArrayList;
import java.util.List;

public class PizzaPepperoni implements IPizza {

	private int id;
	private double value;
	private String size;
	private List<IIngredient> ingredients = new ArrayList<IIngredient>();
	
	private PizzaPepperoni() { }
	
	public static PizzaPepperoni buildPizzaPepperoni() {
		return new PizzaPepperoni();
	}

	@Override
	public String getName() {
		return "Pizza Pepperoni";
	}

	@Override
	public IPizza setValue(double value) {
		this.value = value;
		return this;
	}

	@Override
	public double getValue() {
		return this.value;
	}

	@Override
	public IPizza setSize(String size) {
		this.size = size;
		return this;
	}

	@Override
	public String getSize() {
		return this.size;
	}

	@Override
	public IPizza setId(int id) {
		this.id = id;
		return this;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public IPizza addIIngredient(IIngredient ingredient) {
		this.ingredients.add(ingredient);
		return this;
	}

	@Override
	public List<IIngredient> getIngredients() {
		return this.ingredients;
	}

	@Override
	public IIngredient getIngredient(int id) {
		IIngredient currentIngredient = null;
		
		for (IIngredient ingredient : this.ingredients) {
			
			if (ingredient.getId() == id) {
				currentIngredient = ingredient;
				break;
			}
			
		}
		
		return currentIngredient;
	}

}
