package TaxDecorator;

public class OriginalTax implements ITax {

	private double grossAmount = 0;
	private double tax = 0;
	
	public double getTax() {
		return 0.00;
	}
	
	@Override
	public ITax calculateTax(double value) {
		this.grossAmount = value;

		return this;
	}

	@Override
	public double getTaxCalculationAmount() {

		return this.tax;
	}

	@Override
	public double getGrossValue() {

		return this.grossAmount;
	}
	
	

}
