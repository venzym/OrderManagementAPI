package com.example.gccoffee.model;

import java.util.UUID;

public class OrderItem {
    private UUID productId;
    private Category category;
    private long price;
    private int quantity;

    public UUID getProductId() {
        return productId;
    }

    public Category getCategory() {
        return category;
    }

    public long getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}