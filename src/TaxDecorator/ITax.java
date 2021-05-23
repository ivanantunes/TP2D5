package TaxDecorator;

public interface ITax {
	
	public ITax calculateTax(double value);
	
	public double getTax();
	
	public double getTaxCalculationAmount();
	
	public double getGrossValue();

}
