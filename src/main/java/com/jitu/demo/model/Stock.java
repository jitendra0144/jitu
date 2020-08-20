package com.jitu.demo.model;

import java.sql.Date;
import java.text.ParseException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Stock {

	@Id
	@GeneratedValue
	private int stockId;
	private String stockName;
    private Date purchageDate;
	private Date sellingDate;
	private float purchagePrice;
	private float sellingPrice;

	public Stock()
	{
		
	}
	
	public Stock(int stockId, String stockName, Date purchaseDate, Date sellingDate, float purchasePrice,
			float sellingPrice) throws ParseException {
		this.stockId = stockId;
		this.stockName = stockName;
		this.purchageDate = purchaseDate;
		this.sellingDate = sellingDate;
		this.purchagePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Date getPurchageDate() {
		return purchageDate;
	}

	public void setPurchageDate(Date purchageDate) {
		this.purchageDate = purchageDate;
	}

	public Date getSellingDate() {
		return sellingDate;
	}

	public void setSellingDate(Date sellingDate) {
		this.sellingDate = sellingDate;
	}

	public float getPurchagePrice() {
		return purchagePrice;
	}

	public void setPurchagePrice(float purchagePrice) {
		this.purchagePrice = purchagePrice;
	}

	public float getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", purchageDate=" + purchageDate
				+ ", sellingDate=" + sellingDate + ", purchagePrice=" + purchagePrice + ", sellingPrice=" + sellingPrice
				+ "]";
	}

	


}
