package com.demo.receiver.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import com.demo.receiver.domain.Product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductListener {

	@JmsListener(destination = "product.queue")
	public void receiveProduct(Product product)
	{
		log.info("Product received: \n" + product.toString());
	}
}
