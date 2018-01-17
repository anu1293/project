package com.Accolite;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ProductCatalog {
	@WebMethod
	public String displayProduct(String productId);
	@WebMethod
	public void addProduct(String productId,String product);
	@WebMethod
	public void updateProduct(String productId,String product);
	@WebMethod
	public void deleteProduct(String productId,String product);
	
}
