package com.demo.receiver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.receiver.domain.Product;
import com.demo.receiver.service.ProductReceiver;

@RestController
@RequestMapping("/receiveProduct")
public class ReceiveProductController {
	@Autowired
	private ProductReceiver productReceiver;
	
	@GetMapping
	public Product receiveProduct()
	{
		return productReceiver.receiveProduct();
	}
	
	@GetMapping("/{destination}")
	public Product receiveProductCustomDestination(@PathVariable String destination)
	{
		return productReceiver.receiveProduct(destination);
	}
	
}
