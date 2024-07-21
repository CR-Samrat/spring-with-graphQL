package com.example.spring_with_graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.spring_with_graphql.model.Product;
import com.example.spring_with_graphql.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @QueryMapping
    public List<Product> getProducts(){
        return this.productService.getAllProduct();
    }

    @QueryMapping
    public List<Product> getProductByCategory(@Argument String category){
        return this.productService.getProductByCategory(category);
    }

    @MutationMapping
    public Product updateStock(@Argument int id, @Argument int stock){
        return this.productService.updateStock(id, stock);
    }

    @MutationMapping
    public Product addNewShipment(@Argument int id, @Argument int quantity){
        return this.productService.addNewShipment(id, quantity);
    }
}
