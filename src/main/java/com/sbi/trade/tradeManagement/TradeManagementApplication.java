package com.sbi.trade.tradeManagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.sbi.trade.configuration.ApplicationConfiguration;
import com.sbi.trade.dao.TradeDao;


@SpringBootApplication // it contains 3 annotations
						// 1. component scan - All sub packages of this package will automatically scanned
						// 2. enable auto configuration - when we use enable auto configuration, spring 
						// application scans all dependencies and create its configurations
						// Logger, datasource, validations
						//3. @SpringBootConfiguration
@ComponentScan(basePackages = {"com.sbi.trade.controller"})
@Import(ApplicationConfiguration.class)
public class TradeManagementApplication {

	static Logger logger = LoggerFactory.getLogger(TradeManagementApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TradeManagementApplication.class, args);
		logger.info("Application started suuccessfully");
	}	
	

}
