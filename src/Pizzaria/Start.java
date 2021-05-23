package Pizzaria;

import java.util.Date;

public class Start {

	public static void main(String[] args) {
		
		/* Add Clients */
		
		ClientController clientController = ClientController.getInstance();

		IClient client1 = Client.buildClient()
								.setId(1)
								.setFullname("John E Chaput")
								.setAddress("183  Stadium Drive")
								.setTelephone("978-366-3513");
		
		IClient client2 = Client.buildClient()
								.setId(2)
								.setFullname("Daniel H Johnson")
								.setAddress("2095  Harry Place")
								.setTelephone("662-872-2172");
		
		IClient client3 = Client.buildClient()
								.setId(3)
								.setFullname("Alice M Murray")
								.setAddress("4432  Barnes Avenue")
								.setTelephone("513-205-5966");
		
		clientController.addClient(client1).addClient(client2).addClient(client3);
		
		/* Base - Ingredient */
		
		// TODO: I could have an ingredient control so I wouldn’t need to create a similar pizza again
		
		IIngredient ingredient1 = IngredientFactory.buildIgredient(EIngredientFlavor.Tomato)
													.setId(1)
													.setAmount(2);
		
		IIngredient ingredient2 = IngredientFactory.buildIgredient(EIngredientFlavor.Onion)
													.setId(2)
													.setAmount(2.5);
		
		/* Base - Pizza */
		
		// TODO: You could have a pizza control so you don’t need to create the same pizza again
		
		IPizza pizza1 = PizzaFactory.buildPizza(EPizzaFlavor.Pepperoni)
									.setId(1)
									.setValue(40.00)
									.setSize("Médio")
									.addIIngredient(ingredient1)
									.addIIngredient(ingredient2);
		
		IPizza pizza2 = PizzaFactory.buildPizza(EPizzaFlavor.Portuguese)
									.setId(2)
									.setValue(65.00)
									.setSize("Grande")
									.addIIngredient(ingredient1)
									.addIIngredient(ingredient2);
		
		// TODO: Could make an order factory ?
		
		/* Order - 1 */
		
		IOrder <PizzaOrder, IPizza> order1 = PizzaOrder.buildPizzaOrder()
														.addItems(pizza1)
														.addItems(pizza2)
														.setClient(client1)
														.setDatetime(new Date());
		
		/* Order - 2 */
		
		IOrder <PizzaOrder, IPizza> order2 = PizzaOrder.buildPizzaOrder()
														.addItems(pizza1)
														.addItems(pizza1)
														.addItems(pizza2)
														.setClient(client2)
														.setDatetime(new Date());
		
		/* Order - 3 */
		
		IOrder <PizzaOrder, IPizza> order3 = PizzaOrder.buildPizzaOrder()
														.addItems(pizza1)
														.addItems(pizza1)
														.addItems(pizza2)
														.addItems(pizza2)
														.setClient(client3)
														.setDatetime(new Date());
		
		/* Fiscal Day */
		
		FiscalDay fiscalDay = FiscalDay.getInstance();
		
		fiscalDay.addOrder(order1).addOrder(order2).addOrder(order3);
		
		System.out.println("Total do Dia: " + fiscalDay.closeDay());
		
	}

}
