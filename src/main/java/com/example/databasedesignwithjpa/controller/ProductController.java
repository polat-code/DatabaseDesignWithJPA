package com.example.databasedesignwithjpa.controller;

import com.example.databasedesignwithjpa.model.Product;
import com.example.databasedesignwithjpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/getProducts")
    public ModelAndView getAllProducts() {
        ModelAndView mav = new ModelAndView("Product-show");
        List<Product> products = productService.getAllProducts();
        mav.addObject("products",products);
        return mav;
    }

    @PostMapping("/product/{merchantId}")
    public Product saveProduct(@RequestBody Product product,@PathVariable Long merchantId) {
        return productService.saveProduct(product,merchantId);
    }


}
