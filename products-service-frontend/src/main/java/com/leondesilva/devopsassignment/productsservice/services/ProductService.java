package com.leondesilva.devopsassignment.productsservice.services;

import com.leondesilva.devopsassignment.productsservice.models.ProductModel;

import java.util.List;

/**
 * Interface to represent the product service.
 */
public interface ProductService {
    /**
     * Method to get all products.
     *
     * @return all the products
     */
    List<ProductModel> getProducts();
}
