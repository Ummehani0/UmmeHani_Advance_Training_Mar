package com.umme.springboot.ProductRepository.ProblemStatement2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umme.springboot.Product.ProblemStatement2.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findByName(String name);
}
