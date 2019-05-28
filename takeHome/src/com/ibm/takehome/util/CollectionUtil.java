package com.ibm.takehome.util;

import com.ibm.takehome.bean.Product;
import com.ibm.takehome.service.ProductService;

public class CollectionUtil {
	private static ProductService service = null;
	
	public CollectionUtil(ProductService service)	{
		CollectionUtil.service = service;
	}
	
	public void startService() {
		service.setProductDetails(new Product(1001, 35000, "iPhone", "Electronics", "Mobile Phone"));
		service.setProductDetails(new Product(1002, 45000, "LED TV", "Electronics", "LG LED TV"));
		service.setProductDetails(new Product(1003, 800, "Teddy", "Toys", "Teddy bear"));
		service.setProductDetails(new Product(1004, 5000,"Telescope", "Toys", "Telescope"));
	}
}
