
package com.jitu.demo.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jitu.demo.model.Stock;

@Repository
public class StockRepoImpl implements StockRepoCustom {

	@PersistenceContext
	EntityManager entityManager;

	public List<Stock> findByName(String name) {

		Query query = entityManager.createQuery("from Stock where stockName= :b");
		query.setParameter("b", name);

		return query.getResultList();

	}

	@Override
	public List<Stock> findByPDate(Date  pDate) {
		Query query = entityManager.createQuery("from Stock where purchageDate = :pd");
		query.setParameter("pd", pDate );

		return query.getResultList();
	}

	@Override
	public List<Stock> findBySDate(Date sDate) {
		Query query = entityManager.createQuery("from Stock where sellingDate= :sd");
		query.setParameter("sd", sDate);

		return query.getResultList();
	}

	@Override
	public List<Stock> findByPPrice(float pPrice) {
		Query query = entityManager.createQuery("from Stock where purchagePrice= :pp");
		query.setParameter("pp", pPrice);
		System.out.println("My Query is:" + query.toString());
		return query.getResultList();
	}
	
	@Override
	public List<Stock> findBySPrice(float sPrice) {
		Query query = entityManager.createQuery("from Stock where sellingPrice= :sp");
		query.setParameter("sp", sPrice);

		return query.getResultList();
	}
}
