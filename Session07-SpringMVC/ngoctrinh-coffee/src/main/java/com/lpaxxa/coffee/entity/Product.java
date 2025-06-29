package com.lpaxxa.coffee.entity;

import jakarta.persistence.Entity;

//tương lai, tuần sau, hoặc live!!! sẽ là một entity


public class Product {
    private String id;// nếu là key tự tăng, phải xài Long, wrapper class, ko đc dùng primitive long
    private String name;
    private double price;

    public Product() {
    }
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
