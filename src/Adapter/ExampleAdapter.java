package Adapter;

public class ExampleAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IMovable bugattiVeyron = new BugattiVeyron();
		
		IMovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		
		System.out.println("Bugatti Veyron MPH: " + bugattiVeyron.getSpeed());
		System.out.println("Bugatti Veyron Adapter KMPH: " + bugattiVeyronAdapter.getSpeed());
		
	}

}
