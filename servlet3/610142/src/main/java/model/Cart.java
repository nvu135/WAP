package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Cart {
	private HashMap<String, Product> products = new HashMap<String, Product>();

	private int size;
	private double money;

	public List<Product> getProducts() {
		return new ArrayList<Product>(products.values());
	}

	public void add(Product product) {
		products.put(product.getProductId(), product);
	}

	public Product get(String productId) {
		return products.get(productId);
	}

	public void delete(Product product) {
		products.remove(product);
	}


}
