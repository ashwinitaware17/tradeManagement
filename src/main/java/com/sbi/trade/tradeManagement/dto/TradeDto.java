package com.sbi.trade.tradeManagement.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

// Data transfer object (dto)
public class TradeDto {

	private final int id;
	
	@NotNull
	private final String buyer;
	
	private final String seller;
	
	@Min(1)
	private final int amount;
	
	public TradeDto(int id, String buyer, String seller, int amount) {
		super();
		this.id = id;
		this.buyer = buyer;
		this.seller = seller;
		this.amount = amount;
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

	@Override
	public String toString() {
		return "TradeDto [id=" + id + ", buyer=" + buyer + ", seller=" + seller + ", amount=" + amount + "]";
	}
	
	
	
}
