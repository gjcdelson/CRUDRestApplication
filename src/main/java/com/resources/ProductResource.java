package com.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.representations.Product;
import com.services.ProductService;

@Path("products")
public class ProductResource {
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAllProducts() {
		ProductService prouctService = new ProductService();
		
        return prouctService.getAllProducts();
    }
}
