package com.example.graphql_client.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Component;

import com.example.graphql_client.dto.ProductDto;

@Component
public class SalesClient {

    @Autowired
    private HttpGraphQlClient graphQlClient;

    public List<ProductDto> getProductsByCategory(String category){

        String query = String.format("query GetProducts {\n"+
            "getProductByCategory(category: %s) {\n"+
                "name\n"+
                "category\n"+
                "price\n"+
            "}\n"+
        "}",category);

        return this.graphQlClient.document(query)
                                .retrieve("getProductByCategory")
                                .toEntityList(ProductDto.class)
                                .block();
    }

}
