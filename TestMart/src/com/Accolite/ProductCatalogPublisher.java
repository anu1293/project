package com.Accolite;

import javax.xml.ws.Endpoint;

public class ProductCatalogPublisher {
	public static void main(String[] args) {
		  Endpoint.publish("http://localhost:8020/",new ProductCatalogImpl());
		 }
}
