package com.demo.sender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.demo.sender.domain.Product;

@Service
public class JmsProductSenderService implements ProductSenderService {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Override
	public void sendProduct(Product product)
	{
		jmsTemplate.convertAndSend(product);
	}

	@Override
	public void sendProduct(Product product, String destination) {
		jmsTemplate.convertAndSend(destination, product);
		
	}
	
}
