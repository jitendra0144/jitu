package com.jitu.demo.dao;

import java.sql.Date;
import java.util.List;

import com.jitu.demo.model.Stock;

public interface StockRepoCustom {

	public List<Stock> findByName(String name);

	public List<Stock> findByPDate(Date pDate);

	public List<Stock> findBySDate(Date sDate);

	public List<Stock> findByPPrice(float pPrice);

	public List<Stock> findBySPrice(float sPrice);

}
