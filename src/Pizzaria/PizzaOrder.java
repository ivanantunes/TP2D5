package Pizzaria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PizzaOrder implements IOrder<PizzaOrder, IPizza> {

	private List<IPizza> pizzas = new ArrayList<IPizza>();
	private IClient client;
	private Date datetime;
	
	private PizzaOrder() { }
	
	public static PizzaOrder buildPizzaOrder() {
		
		return new PizzaOrder();
		
	}

	@Override
	public PizzaOrder addItems(IPizza item) {
		this.pizzas.add(item);
		return this;
	}

	@Override
	public List<IPizza> getItems() {
		return this.pizzas;
	}

	@Override
	public PizzaOrder setClient(IClient client) {
		this.client = client;
		return this;
	}

	@Override
	public IClient getClient() {
		return this.client;
	}

	@Override
	public PizzaOrder setDatetime(Date datetime) {
		this.datetime = datetime;
		return this;
	}

	@Override
	public Date getDatetime() {
		return this.datetime;
	}

	@Override
	public double getTotal() {
		double total = 0;
		
		for (IPizza pizza : this.pizzas) {
			total += pizza.getValue();
		}
		
		return total;
	}
	
}
