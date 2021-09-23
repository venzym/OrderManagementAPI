package com.example.gccoffee.controller;

import com.example.gccoffee.model.Category;

public class CreateProductRequest {
    private String productName;
    private Category category;
    private long price;
    private String description;

    public String getProductName() {
        return productName;
    }

    public Category getCategory() {
        return category;
    }

    public long getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
