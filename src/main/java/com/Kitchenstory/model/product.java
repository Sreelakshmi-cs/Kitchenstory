package com.Kitchenstory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	
	private String name;
	
	private String category;
	
	private  long price;
	
	private int quantity;
	

	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public product(String name, String category, long price, int quantity) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "product [pid=" + pid + ", name=" + name + ", category=" + category + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	

}
