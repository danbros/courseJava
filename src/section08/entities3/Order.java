package section08.entities3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import section08.entities3.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> orderItem = new ArrayList<>();
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	//Get/Set
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	//Methods
	public void addItem(OrderItem item) {
		orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}
	
	public double total() {
		double tot = 0;//tot = 0.0 test
		for(OrderItem item : orderItem) {
			tot += (double)item.subTotal();
		}
		return tot;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("OrDER SUMMARY:\nOrder moment: " + sdf.format(moment));								
		sb.append("\nOrder status:" + status);						
		sb.append("\nClient: " + client);				
		sb.append("Order items:\n");														
		for(OrderItem item : orderItem) {							
			//sb.append(item.getText() + "\n"); e??????u
			sb.append(item + "\n");
		}														
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
		
	}
}
