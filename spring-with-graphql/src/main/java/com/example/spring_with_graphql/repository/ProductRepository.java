package com.example.spring_with_graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_with_graphql.model.Product;
import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Integer>{
    List<Product> findByCategory(String category);
}
