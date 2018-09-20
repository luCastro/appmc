package com.lucianacunha.appmc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucianacunha.appmc.domain.Category;
import com.lucianacunha.appmc.repositories.CategoryRepository;

@SpringBootApplication
public class AppmcApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	public static void main (String[] args) {
		SpringApplication.run(AppmcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category c1 = new Category(null, "Informatic");
		Category c2 = new Category(null, "Office");
		
		categoryRepository.saveAll(Arrays.asList(c1, c2));
	}
		
}
