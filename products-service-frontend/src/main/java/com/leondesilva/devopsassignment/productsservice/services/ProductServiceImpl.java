package com.leondesilva.devopsassignment.productsservice.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leondesilva.devopsassignment.productsservice.models.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation class of the product service.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     * Method to get all products.
     *
     * @return all the products
     */
    @Override
    public List<ProductModel> getProducts() {
        JsonNode result = restTemplate.getForObject("http://localhost:9000/products", JsonNode.class);
        try {
            return objectMapper.readValue(result.toString(), List.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }


}
