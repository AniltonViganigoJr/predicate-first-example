package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Macbook Pro", 25000.00));
		products.add(new Product("iPhone 16", 16000.00));
		products.add(new Product("Notebook Lenovo", 5000.00));
		products.add(new Product("Airpods", 200.00));
		products.add(new Product("Smart TV LG 4K", 4850.00));
		products.add(new Product("External SSD 1Tb", 785.00));
		
		double min = 1000.00;
		
		Predicate<Product> productPredicate = (p -> p.getPrice() >= min);
		
		products.removeIf(productPredicate);
		
		for(Product p : products) {
			System.out.println(p);
		}
	}
}