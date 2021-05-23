package TaxDecorator;

public class TaxDecorator implements ITax {

	private ITax tax;
	
	public TaxDecorator(ITax tax) {
		this.tax = tax;
	}
	
	@Override
	public ITax calculateTax(double value) {

		return this.calculateTax(value);

	}

	@Override
	public double getTax() {

		return this.tax.getTax();
	}

	@Override
	public double getTaxCalculationAmount() {

		return this.tax.getTaxCalculationAmount();
	}

	@Override
	public double getGrossValue() {

		return this.tax.getGrossValue();
	}

}
