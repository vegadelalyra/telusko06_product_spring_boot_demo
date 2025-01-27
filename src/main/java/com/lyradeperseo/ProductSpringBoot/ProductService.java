package com.lyradeperseo.ProductSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void show() {
        System.out.println("in show");
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
