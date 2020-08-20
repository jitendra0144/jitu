package com.jitu.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.jitu.demo.model.Stock;

public interface StockRepo extends CrudRepository<Stock, Integer>, StockRepoCustom{

	


}
