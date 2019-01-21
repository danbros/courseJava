package secao05.entities;

public class ProductV {

	private String name;
	private double price;
	
	//CONST
	public ProductV(String name, double price) {
		this.name = name;
		this.price = price;
	}

	//GET SET
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
}
