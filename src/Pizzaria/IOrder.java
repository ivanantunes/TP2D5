package Pizzaria;

import java.util.Date;
import java.util.List;

public interface IOrder<X, Y> {

	public X addItems(Y item);
	public List<Y> getItems();
	
	public X setClient(IClient client);
	public IClient getClient();
	
	public X setDatetime(Date datetime);
	public Date getDatetime();
	
	public double getTotal();	

}
