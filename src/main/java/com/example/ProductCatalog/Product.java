package com.example.ProductCatalog;

public class Product {
    private String name;
    private int id;
    private int price;
    private String
            description;


    public Product(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.id = (int) (Math.random() * 10000.0);
        System.out.println(id);
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() { return description;}
}
