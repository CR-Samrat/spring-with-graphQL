package com.example.graphql_client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.graphql_client.dto.ProductDto;
import com.example.graphql_client.service.SalesService;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;
    
    @GetMapping("/products/category")
    //Example -> http://localhost:8081/sales/products/category?category="Electronics"
    public List<ProductDto> getProducts(@RequestParam String category){
        return this.salesService.getProductByCategory(category);
    }

}
