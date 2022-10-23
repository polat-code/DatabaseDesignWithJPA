package com.example.databasedesignwithjpa.service;

import com.example.databasedesignwithjpa.model.Merchant;
import com.example.databasedesignwithjpa.model.Product;
import com.example.databasedesignwithjpa.repository.MerchantsRepository;
import com.example.databasedesignwithjpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    MerchantsRepository merchantsRepository;


    public Product saveProduct(Product product, Long merchantId) {
        Merchant merchant = merchantsRepository.findById(merchantId).get();
        product.setMerchant(merchant);
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }
}
