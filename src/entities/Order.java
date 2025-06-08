package entities;

import java.sql.Date;

public class Order {
	
	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;
		this.product.setName("TV");
	}
	
	private Date date; 
	private Product product;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	} 

}
