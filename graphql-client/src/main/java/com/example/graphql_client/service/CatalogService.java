package com.example.graphql_client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.graphql_client.client.CatalogClient;
import com.example.graphql_client.dto.ProductDto;

@Service
public class CatalogService {
    
    @Autowired
    private CatalogClient catalogClient;

    public List<ProductDto> getProducts(){
        return this.catalogClient.getProducts();
    }
}
