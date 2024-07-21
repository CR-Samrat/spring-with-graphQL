package com.example.graphql_client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ClientConfiguration {
    
    // In the configuration file we need to configure graphQL client
    @Bean
    public HttpGraphQlClient graphQlClient(){

        // GraphQL client constructor needs a WebClient
        WebClient webClient = WebClient.builder()
                                        .baseUrl("http://localhost:8080/graphql")
                                        .build();

        // pass the webClient into GraphQL and create build a graphQL client
        return HttpGraphQlClient.builder(webClient).build();
    }
}
