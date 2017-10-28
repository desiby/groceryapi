package com.desiby.entity;

import org.springframework.data.annotation.Id;

//no need for @Entity since mongo is noSQL
public class Product {

    @Id
    private String id;
    private String name;
    private double price;

    private Product() {}

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(
                "Product[id=%s, Name='%s', price='%.2f']",
                id, name, price);
    }
}
