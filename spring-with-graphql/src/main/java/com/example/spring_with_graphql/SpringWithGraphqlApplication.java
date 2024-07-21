package com.example.spring_with_graphql;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring_with_graphql.model.Product;
import com.example.spring_with_graphql.repository.ProductRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringWithGraphqlApplication {

	// @Autowired
	// private ProductRepository repository;

	// @PostConstruct
	// public void initDB(){
	// 	List<Product> products = Stream.of(
	// 			new Product("Laptop", "Electronics", 74999.99f, 50),
	// 			new Product("Smartphone", "Electronics", 39999.99f, 100),
	// 			new Product("Office Chair", "Furniture", 7999.99f, 200),
	// 			new Product("Notebook", "Stationery", 99.99f, 500),
	// 			new Product("Desk Lamp", "Furniture", 1999.99f, 150),
	// 			new Product("Water Bottle", "Accessories", 499.99f, 300)
	// 	).collect(Collectors.toList());
	// 	repository.saveAll(products);
	// }

	public static void main(String[] args) {
		SpringApplication.run(SpringWithGraphqlApplication.class, args);
	}

}
