package com.demo.sender.domain;

import java.util.List;

import lombok.Data;

@Data
public class Product {
	private long id;
	private String name;
	private double price;
	private List<Product> relatedProducts;
}
