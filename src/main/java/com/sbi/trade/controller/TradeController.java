package com.sbi.trade.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.trade.exception.TradeNotFoundException;
import com.sbi.trade.service.TradeService;
import com.sbi.trade.tradeManagement.dto.TradeDto;

@RestController // This is for mapping Rest API with the java class
@RequestMapping("/trade") // This is to map Rest API path
public class TradeController {

	static Logger logger = LoggerFactory.getLogger(TradeController.class);

	@Autowired // to inject dependency
	TradeService tradeService;

	@GetMapping("/get/{id}") // This is to map Rest API path with specific method
	public String getTrade(@PathVariable int id) {
		if (id > 5) {
			throw new TradeNotFoundException("Trade id is greater than 5");
		}
		logger.info("(getTrade) Received request for id {}", id);
		return "trade for id:- " + id;

	}

	@PostMapping("/create") // This is to map Rest API path with specific method
	public String createTrade(@Valid @RequestBody TradeDto inputTradeDto) {
		// @RequestBody is to convert input json body to java class
		logger.info("(createTrade) Received request inputTradeDto {}", inputTradeDto);
		tradeService.storeTrade(inputTradeDto);

		return "trade created";
	}

	@DeleteMapping("/delete/{id}")
	public String deleteTrade(@PathVariable int id) {
		return "received request to delete id " + id;
	}

}
