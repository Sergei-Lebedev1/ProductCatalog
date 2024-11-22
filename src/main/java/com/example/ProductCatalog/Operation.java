package com.example.ProductCatalog;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Operation {

    List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Operation() {
        this.products.add(new Product("Чайник", 500, "Tefal"));
        this.products.add(new Product("Кофеварка", 1500, "Coffer"));
        this.products.add(new Product("Микроволновка", 100, "Micro"));
    }
}
