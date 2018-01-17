package com.Accolite;

import java.util.HashMap;

import javax.jws.WebService;


@WebService(endpointInterface="com.Accolite.ProductCatalog")
public class ProductCatalogImpl implements ProductCatalog {
	
	
	HashMap<String, String> hMap = new HashMap<String, String>();
	
	@Override
	public void addProduct(String productId, String product) {
		hMap.put(productId, product);
	}
	@Override
	public String displayProduct(String productId) {
		if (hMap.containsKey(productId)) {
			return hMap.get(productId).toString();
	    } 
		else {
	       return "product not found";
	    }
	}
	@Override
	public void updateProduct(String ProductId, String product) {
		hMap.put(ProductId,product);
	}

	@Override
	public void deleteProduct(String productId, String product) {
		// TODO Auto-generated method stub
		
	}

}