package section09.entities04;

public class IndividualPerson extends Person{

	private Double healthSpend;
	
	public IndividualPerson() {
		super();
	}
	
	public IndividualPerson(String name, Double income, Double healthSpend) {
		super(name, income);
		this.healthSpend = healthSpend;
	}

	public Double getHealthSpend() {
		return healthSpend;
	}

	public void setHealthSpend(Double healthSpend) {
		this.healthSpend = healthSpend;
	}

	@Override
	public Double taxValue() {
		Double taxValue = 0.0;
		if(getIncome() < 20000.00) {
			taxValue += getIncome() * 0.15;
			if(healthSpend > 0) {
				taxValue -= healthSpend / 2;
			}
		}
		
		if(getIncome() >= 20000.00) {
			taxValue += getIncome() * 0.25;
			if(healthSpend > 0) 
				taxValue -= healthSpend / 2;
			
		}
		return taxValue;
	}
	
	public String toString() {
		return getName()
				+ ": $ "
				+ String.format("%.2f", taxValue());
	}
	
	
}
