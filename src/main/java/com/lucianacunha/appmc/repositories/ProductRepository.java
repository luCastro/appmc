package com.lucianacunha.appmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucianacunha.appmc.domain.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
