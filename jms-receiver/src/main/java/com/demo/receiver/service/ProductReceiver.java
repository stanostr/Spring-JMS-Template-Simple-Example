package com.demo.receiver.service;

import com.demo.receiver.domain.Product;

public interface ProductReceiver {

	Product receiveProduct();

	Product receiveProduct(String destination);

}