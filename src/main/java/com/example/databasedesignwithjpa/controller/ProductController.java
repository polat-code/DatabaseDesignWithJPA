package com.example.databasedesignwithjpa.controller;

import com.example.databasedesignwithjpa.model.Product;
import com.example.databasedesignwithjpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/product/{merchantId}")
    public Product saveProduct(@RequestBody Product product,@PathVariable Long merchantId) {
        return productService.saveProduct(product,merchantId);
    }


}
