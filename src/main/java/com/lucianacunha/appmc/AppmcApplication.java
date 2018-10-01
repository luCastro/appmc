package com.lucianacunha.appmc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucianacunha.appmc.domain.Category;
import com.lucianacunha.appmc.domain.Product;
import com.lucianacunha.appmc.repositories.CategoryRepository;
import com.lucianacunha.appmc.repositories.ProductRepository;

@SpringBootApplication
public class AppmcApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	
	
	public static void main (String[] args) {
		SpringApplication.run(AppmcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category c1 = new Category(null, "Informatic");
		Category c2 = new Category(null, "Office");
		
		Product p1 = new Product(null, "Desktop", 3500.00);
		Product p2 = new Product(null, "Print Machine", 45.00);
		Product p3 = new Product(null, "Mouse", 23.00);
				
		categoryRepository.saveAll(Arrays.asList(c1, c2));	
		
		p1.getCategories().addAll(Arrays.asList(c2));
		p2.getCategories().addAll(Arrays.asList(c1,c2));
		p3.getCategories().addAll(Arrays.asList(c1));
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		
	}
		
}
