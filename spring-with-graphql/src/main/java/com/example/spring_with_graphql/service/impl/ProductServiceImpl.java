package com.example.spring_with_graphql.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_with_graphql.model.Product;
import com.example.spring_with_graphql.repository.ProductRepository;
import com.example.spring_with_graphql.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return this.productRepository.findAll();
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return this.productRepository.findByCategory(category);
    }

    @Override
    public Product updateStock(int id, int stock) {
        Product product = this.productRepository.findById(id)
                                                .orElseThrow(() -> new RuntimeException("Invalid product id"));

        if(stock < 0){
            throw new RuntimeException("Invalid stock");
        }else{
            product.setStock(stock);
            return this.productRepository.save(product);
        }

    }

    @Override
    public Product addNewShipment(int id, int quantity) {
        Product product = this.productRepository.findById(id)
                                                .orElseThrow(() -> new RuntimeException("Invalid product id"));

        if(quantity < 0){
            throw new RuntimeException("Invalid quantity");
        }else{
            product.setStock(product.getStock()+quantity);
            return this.productRepository.save(product);
        }
    }
    
}
