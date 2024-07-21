package com.example.spring_with_graphql.service;

import java.util.List;

import com.example.spring_with_graphql.model.Product;

public interface ProductService {
    List<Product> getAllProduct();
    List<Product> getProductByCategory(String category);
    Product updateStock(int id, int stock);
    Product addNewShipment(int id, int quantity);
}
