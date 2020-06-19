package com.demo.sender.service;

import com.demo.sender.domain.Product;

public interface ProductSenderService {

	void sendProduct(Product product);

	void sendProduct(Product product, String destination);

}