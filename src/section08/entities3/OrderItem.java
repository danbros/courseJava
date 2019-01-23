package section08.entities3;

public class OrderItem {

	private int quantity;//prof usou Integer
	private double price;//e Double
	
	private Product product;
	
	public OrderItem() {
	}

	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;//prof
	}
	//Get/Set
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	//Methods
	public double subTotal() {
			return price * quantity;
	}
	//saida do "item", pensei em fazer na classe Order usando get, vacilo
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}
