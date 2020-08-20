package com.jitu.demo.controller;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jitu.demo.model.Stock;
import com.jitu.demo.service.StockService;

@RestController
public class MyController {

	@Autowired
	StockService stockService;

	@PostMapping(value = "/createStock")
	public void createStock(@RequestBody Stock stock) {

		stockService.createStock(stock);
	}

	@PostMapping(value = "/createMultipleStocks")
	public void createStock(@RequestBody List<Stock> stockList) {

		stockService.createMultipleStock(stockList);
	}

	@GetMapping("/getAllStock")
	public List<Stock> getAllStock() {
		
		return stockService.getAllStock();
	}

	@GetMapping("/getStockById/{stockId}")
	public Optional<Stock> getStockById(@PathVariable("stockId") int stockId) {

		return stockService.getStockById(stockId);
	}

	@GetMapping("/getStockByName/{stockName}")
	public List<Stock> getStockByName(@PathVariable("stockName") String stockName) {

		return stockService.getStockByName(stockName);
	}

	@GetMapping("/getStockByPDate/{pDate}")
	public List<Stock> getStockByPDate(@PathVariable("pDate") Date pDate) throws ParseException {

		return stockService.getStockByPDate(pDate);
	}

	@GetMapping("/getStockBySDate/{sDate}")
	public List<Stock> getStockBySDate(@PathVariable("sDate") Date sDate) {

		return stockService.getStockBySDate(sDate);
	}

	@GetMapping("/getStockBySPrice/{sPrice}")
	public List<Stock> getStockBySPrice(@PathVariable("sPrice") float sPrice) {

		return stockService.getStockBySPrice(sPrice);
	}

	@GetMapping("/getStockByPPrice/{pPrice}")
	public List<Stock> getStockByPPrice(@PathVariable float pPrice) {

		return stockService.getStockByPPrice(pPrice);
	}
}
