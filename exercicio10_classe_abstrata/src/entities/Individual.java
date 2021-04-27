package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double totalTaxes = 0.0;
		
		if (anualIncome >= 20000.00 ) {
			totalTaxes = anualIncome * 0.25;
		} else {
			totalTaxes = anualIncome * 0.15;
		}
		
		double refunds = healthExpenditures * 0.5;
		
		return totalTaxes - refunds;
	}

}
