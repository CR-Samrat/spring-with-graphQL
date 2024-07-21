package com.example.graphql_client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.graphql_client.client.SalesClient;
import com.example.graphql_client.dto.ProductDto;

@Service
public class SalesService {

    @Autowired
    private SalesClient salesClient;

    public List<ProductDto> getProductByCategory(String category){
        return this.salesClient.getProductsByCategory(category);
    }
}
