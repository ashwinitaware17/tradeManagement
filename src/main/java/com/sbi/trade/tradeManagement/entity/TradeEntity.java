package com.sbi.trade.tradeManagement.entity;

import java.util.Date;

//table columns are stored in entity
public class TradeEntity {
	
	private final int id;
	private final String buyer;
	private final String seller;
	private final int amount;
	private final Date createdDate;
	
	
	public TradeEntity(int id, String buyer, String seller, int amount, Date createdDate) {
		super();
		this.id = id;
		this.buyer = buyer;
		this.seller = seller;
		this.amount = amount;
		this.createdDate = createdDate;
	}
	public int getId() {
		return id;
	}
	public String getBuyer() {
		return buyer;
	}
	public String getSeller() {
		return seller;
	}
	public int getAmount() {
		return amount;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	@Override
	public String toString() {
		return "TradeEntity [id=" + id + ", buyer=" + buyer + ", seller=" + seller + ", amount=" + amount
				+ ", createdDate=" + createdDate + "]";
	}
	
	
	

}
