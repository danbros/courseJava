package section09.entities04;

public class LegalPerson extends Person{

	private Integer numEmployee;

	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Double income, Integer numEmployee) {
		super(name, income);
		this.numEmployee = numEmployee;
	}

	public Integer getNumEmployee() {
		return numEmployee;
	}

	public void setNumEmployee(Integer numEmployee) {
		this.numEmployee = numEmployee;
	}

	@Override
	public Double taxValue() {
		Double taxValue = 0.0;
		if(numEmployee > 10) 
			taxValue += getIncome() * 0.14;
		
		else
			taxValue += getIncome() * 0.16;
		return taxValue;
	}
	
	public String toString() {
		return getName()
				+ ": $ "
				+ String.format("%.2f", taxValue());
		
	}
}
