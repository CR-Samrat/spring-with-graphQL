package com.example.graphql_client.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Component;

import com.example.graphql_client.dto.ProductDto;

@Component
public class CatalogClient {
    
    @Autowired
    private HttpGraphQlClient graphQlClient;

    public List<ProductDto> getProducts(){

        String query = "query GetProducts {\n"+
            "getProducts {\n"+
                "name\n"+
                "price\n"+
            "}\n"+
        "}";

        return this.graphQlClient.document(query)
                                .retrieve("getProducts")
                                .toEntityList(ProductDto.class)
                                .block();
    }
}
