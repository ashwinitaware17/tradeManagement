package com.sbi.trade.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sbi.trade.dao.TradeDao;
import com.sbi.trade.service.TradeService;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public TradeDao getTradeDao() {
		return new TradeDao();
	}
	
	@Bean
	public TradeService getTradeService() {
		return new TradeService();
	}
	
	
}
