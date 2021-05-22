package Adapter;

public class MovableAdapterImpl implements IMovableAdapter {

	private IMovable luxuryCars;
	
	public MovableAdapterImpl(IMovable luxuryCars) {
		this.luxuryCars = luxuryCars;
	}
	
	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return this.convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	  private double convertMPHtoKMPH(double mph) {
	        return mph * 1.60934;
	    }
	
}
