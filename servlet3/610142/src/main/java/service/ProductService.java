package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductService {

    private static HashMap<String, Product> products = new HashMap<String, Product>();

    static {
        products.put("1", new Product("1", "Bike", "Schwinn aluminum dual sport frame with Schwinn suspension fork for durable, versatile riding\n", 1000 ));
        products.put("2", new Product("2", "Phone", "Samsung Galaxy S10 128GB SM-G973F/DS Dual Sim (FACTORY UNLOCKED) 6.1\" 8GB RAM\n", 2010));
        products.put("3", new Product("3", "Laptop", "This Latitude E6320 is an off-lease/preowned 13.3\" widescreen Dual Core portable notebook from a Fortune 500 company. This 3.75 pound Notebook Computer features an Intel Core i5 2.5GHz processor, 8.0GB (8192MB) of DDR3 memory, a 320GB SATA hard drive, and an internal DVD drive (play DVDs and CDs). It also features built in onboard WiFi. Whether you're at home or traveling, this fast, powerful Laptop Computer will provide you with an exciting computing experience.\n" +
                "\n", 200));


    }

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


