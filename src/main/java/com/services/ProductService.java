package com.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.representations.Product;

public class ProductService {
	public List<Product> getAllProducts() {
		ArrayList<Product> allProducts = new ArrayList<Product>();
		
		Product p = new Product();
		p.setId(String.valueOf(UUID.randomUUID()));
		p.setName("Apple");
		p.setExpiration(new Date());
		
		allProducts.add(p);
		
		p = new Product();
		p.setId(String.valueOf(UUID.randomUUID()));
		p.setName("Orange");
		p.setExpiration(new Date());
		
		allProducts.add(p);
		
		return allProducts;
	}
}
