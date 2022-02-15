package com.leondesilva.devopsassignment.productsservice.controllers;

import com.leondesilva.devopsassignment.productsservice.models.ProductModel;
import com.leondesilva.devopsassignment.productsservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductsController {
    @Autowired
    private ProductService productService;

    /**
     * Controller method to get all the products.
     *
     * @return all the products
     */
    @GetMapping("/products")
    public String getAllProducts(Model model) {
        model.addAttribute("message", productService.getProducts());
        return "products"; //view
    }
}
