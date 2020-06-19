package com.demo.sender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.sender.domain.Product;
import com.demo.sender.service.ProductSenderService;

@RestController
@RequestMapping("/sendProduct")
public class ProductController {
	@Autowired
	private ProductSenderService productSenderService;

	@PostMapping
	public String sendProduct(@RequestBody Product product) {
		productSenderService.sendProduct(product);
		return "{ \"message\":\"sent product to receiver\" }";
	}
	
	@PostMapping("/{destination}")
	public String sendProductCustomDestination(@RequestBody Product product, @PathVariable String destination) {
		productSenderService.sendProduct(product, destination);
		return "{ \"message\":\"sent product to receiver\" }";
	}
	
}
