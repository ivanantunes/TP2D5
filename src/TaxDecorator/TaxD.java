package TaxDecorator;

public class TaxD extends TaxDecorator {
	private double grossAmount = 0;
	private double tax = 0;
	
	public TaxD(ITax tax) {
		super(tax);
	}
	
	public ITax calculateTax(double value) {
		this.grossAmount = value - super.getTaxCalculationAmount();
		this.tax = super.getTaxCalculationAmount();
		
		return this;
	}

	public double getTax() {
		return 0.01; // 1%
	}
	
	public double getTaxCalculationAmount() {
		return this.tax;
	}
	
	public double getGrossValue() {
		return this.grossAmount;
	}

}
