package section08.entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private double valuePerHour;
	private int hours;
	//Constructors
	public HourContract(Date contractDate, double valuePerHour, int hours) {
		this.date = contractDate;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	//Get/Set
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	//Methods
	public double totalValue() {
			return valuePerHour * hours;
	}
}
