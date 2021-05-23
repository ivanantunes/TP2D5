package Pizzaria;

import java.util.ArrayList;
import java.util.List;

public class FiscalDay {

	private static FiscalDay instance;
	
	private List<IOrder<?, ?>> orders = new ArrayList<IOrder<?, ?>>();
	
	
	private FiscalDay() { }
	
	public static FiscalDay getInstance() {
		
		if (FiscalDay.instance == null) {
			FiscalDay.instance = new FiscalDay();
		}
		
		return FiscalDay.instance;
		
	}
	
	public static void destroyInstance() {
		FiscalDay.instance = null;
	}
	
	public FiscalDay addOrder(IOrder<?, ?> order) {
		// TODO: Class fiscal day may need to pass the date
		
		this.orders.add(order);
		return this;
	}
	
	public List<IOrder<?, ?>> getOrders() {
		return this.orders;
	}
	
	public double closeDay() {
		double total = 0;
		
		for (IOrder<?, ?> order : this.orders) {
			total += order.getTotal();
		}
		
		return total;
	}
	
}
