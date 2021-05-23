package TaxDecorator;

public class TaxC extends TaxDecorator {
	
	private double grossAmount = 0;
	private double tax = 0;
	
	public TaxC(ITax tax) {
		super(tax);
	}
	
	public ITax calculateTax(double value) {
		this.tax = value * getTax();
		this.grossAmount = value;
		
		return this;
	}

	public double getTax() {
		return 0.08; // 8%
	}
	
	public double getTaxCalculationAmount() {
		return this.tax;
	}
	
	public double getGrossValue() {
		return this.grossAmount;
	}

}
