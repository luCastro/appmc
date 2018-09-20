package com.lucianacunha.appmc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lucianacunha.appmc.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	
}
