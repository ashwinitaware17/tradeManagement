package com.sbi.trade.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.trade.dao.TradeDao;
import com.sbi.trade.tradeManagement.dto.TradeDto;
import com.sbi.trade.tradeManagement.entity.TradeEntity;


public class TradeService {
	
	static Logger logger = LoggerFactory.getLogger(TradeService.class);
	
	@Autowired
	TradeDao tradeDao;
	
	public void storeTrade(TradeDto inputTradeDto) {
		logger.info("(storeTrade) Received required inputTradeDto {}", inputTradeDto);
		// we store entity in DB
		// I have to create entity object from dto
		TradeEntity tradeEntity = new TradeEntity(inputTradeDto.getId(), inputTradeDto.getBuyer(),
				inputTradeDto.getSeller(), inputTradeDto.getAmount(), new Date());
		tradeDao.storeTrade(tradeEntity);
		
	}

}
