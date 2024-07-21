package com.example.graphql_client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.graphql_client.dto.ProductDto;
import com.example.graphql_client.service.CatalogService;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;
    
    @GetMapping("/products")
    public List<ProductDto> getProducts(){
        return catalogService.getProducts();
    }
}
