package com.demo.receiver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.demo.receiver.domain.Product;

@Service
public class JmsProductReceiver implements ProductReceiver {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Override
	public Product receiveProduct()
	{
		return (Product) jmsTemplate.receiveAndConvert();
	}

	@Override
	public Product receiveProduct(String destination) {
		return (Product) jmsTemplate.receiveAndConvert(destination);
	}
}
