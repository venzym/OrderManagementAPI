package com.example.gccoffee.controller;

import com.example.gccoffee.model.OrderItem;

import java.util.List;

public class CreateOrderRequest {
    private String email;
    private String address;
    private String postcode;
    private List<OrderItem> orderItems;

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
