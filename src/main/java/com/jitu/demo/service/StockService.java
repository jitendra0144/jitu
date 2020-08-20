package com.jitu.demo.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jitu.demo.dao.StockRepo;
import com.jitu.demo.model.Stock;

@Service
public class StockService {

	@Autowired
	StockRepo stockRepo;

	public void createStock(Stock stock) {

		stockRepo.save(stock);
	}

	public void createMultipleStock(List<Stock> stockList) {
		stockRepo.saveAll(stockList);
	}

	public List<Stock> getAllStock() {

		List<Stock> list = null; // new ArrayList<>();
		list = (List) stockRepo.findAll();// .forEach(stock -> list.add(stock));
		return list;
	}

	public Optional<Stock> getStockById(int id) {

		return stockRepo.findById(id);
	}

	public List<Stock> getStockByName(String name) {

		return stockRepo.findByName(name);
	}

	public List<Stock> getStockByPDate(Date date) {

		return stockRepo.findByPDate(date);
	}

	public List<Stock> getStockBySDate(Date date) {

		return stockRepo.findBySDate(date);
	}

	public List<Stock> getStockBySPrice(float sPrice) {

		return stockRepo.findBySPrice(sPrice);
	}

	public List<Stock> getStockByPPrice(float pPrice) {

		return stockRepo.findByPPrice(pPrice);
	}
}
