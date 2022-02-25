package com.Kitchenstory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class cart {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int cartid;
	
	private int productid;
	
	private String productname;
	
	private int quantity;
	
	private int price;

	public cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public cart(int productid, String productname, int quantity, int price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.quantity = quantity;
		this.price = price;
	}


	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "cart [cartid=" + cartid + ", productid=" + productid + ", productname=" + productname + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
}
