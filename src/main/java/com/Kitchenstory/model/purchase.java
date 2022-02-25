package com.Kitchenstory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase")
public class purchase {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int purid;

	private String cardnum;
	
	private int amount;
	
	private int totalpdcts;
	
	private int cid;

	
	public purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public purchase(String cardnum, int amount, int totalpdcts, int cid) {
		super();
		this.cardnum = cardnum;
		this.amount = amount;
		this.totalpdcts = totalpdcts;
		this.cid = cid;
	}


	public int getPurid() {
		return purid;
	}

	public void setPurid(int purid) {
		this.purid = purid;
	}

	public String getCardnum() {
		return cardnum;
	}

	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotalpdcts() {
		return totalpdcts;
	}

	public void setTotalpdcts(int totalpdcts) {
		this.totalpdcts = totalpdcts;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "purchase [purid=" + purid + ", cardnum=" + cardnum + ", amount=" + amount + ", totalpdcts=" + totalpdcts
				+ ", cid=" + cid + "]";
	}

}
