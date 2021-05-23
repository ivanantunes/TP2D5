package TaxDecorator;

public class TaxA extends TaxDecorator {
	private double grossAmount = 0;
	private double tax = 0;
	
	public TaxA(ITax tax) {
		super(tax);
	}
	
	public ITax calculateTax(double value) {
		this.tax = value * getTax();
		this.grossAmount = value;
		
		return this;
	}

	public double getTax() {
		return 0.02; // 2%
	}
	
	public double getTaxCalculationAmount() {
		return this.tax;
	}
	
	public double getGrossValue() {
		return this.grossAmount;
	}

}
