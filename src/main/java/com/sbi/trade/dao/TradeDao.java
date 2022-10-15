package com.sbi.trade.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.sbi.trade.tradeManagement.entity.TradeEntity;


public class TradeDao {

	Logger logger = LoggerFactory.getLogger(TradeDao.class);
	
	public void storeTrade(TradeEntity tradeEntity) {
		logger.info("(storeTrade) entity to store tradeEntity {}", tradeEntity);
	}
}
