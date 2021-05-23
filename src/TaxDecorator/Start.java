package TaxDecorator;

import java.text.DecimalFormat;

public class Start {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.00"); 
		
		// Original Tax
		
		ITax originalTax = new OriginalTax();
		
		originalTax.calculateTax(36000);
		
		System.out.println("Valor Original: R$" + df.format(originalTax.getGrossValue()));
		System.out.println("");
		
		// Tax-A
		
		ITax taxA = new TaxA(originalTax);
		
		taxA.calculateTax(originalTax.getGrossValue());
		
		System.out.println("Taxa A: R$" + df.format(taxA.getTaxCalculationAmount()));
		System.out.println("Valor Atual: R$" + df.format(taxA.getGrossValue()));
		System.out.println("");
		
		// Tax-B
		
		ITax taxB = new TaxB(taxA);
		
		taxB.calculateTax(originalTax.getGrossValue());
		
		System.out.println("Taxa B: R$" + df.format(taxB.getTaxCalculationAmount()));
		System.out.println("Valor Atual: R$" + df.format(taxB.getGrossValue()));
		System.out.println("");
		
		// Tax-C
		
		ITax taxC = new TaxC(taxB);
		
		taxC.calculateTax(taxB.getGrossValue());
		
		System.out.println("Taxa C: R$" + df.format(taxC.getTaxCalculationAmount()));
		System.out.println("Valor Atual: R$" + df.format(taxC.getGrossValue()));
		System.out.println("");
		
		// Tax-D
		
		ITax taxD = new TaxD(taxB);
		
		taxD.calculateTax(taxC.getGrossValue());
		
		ITax taxD2 = new TaxD(taxC);
		taxD2.calculateTax(taxD.getGrossValue());
		
		System.out.println("Taxa D: R$" + df.format(taxD2.getTaxCalculationAmount()));
		System.out.println("Valor Atual: R$" + df.format(taxD2.getGrossValue()));
		
	}

}
