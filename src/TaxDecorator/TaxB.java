package TaxDecorator;

public class TaxB extends TaxDecorator {

	private double grossAmount = 0;
	private double tax = 0;
	
	public TaxB(ITax tax) {
		super(tax);
	}
	
	public ITax calculateTax(double value) {
		this.grossAmount = value - super.getTaxCalculationAmount();
		this.tax = super.getTaxCalculationAmount();
		return this;
	}

	public double getTax() {
		return 0.10; // 10%
	}
	
	public double getTaxCalculationAmount() {
		return this.tax;
	}

	public double getGrossValue() {
		return this.grossAmount;
	}
}
