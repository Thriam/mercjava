package com.example.IO.serializationPack;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private transient int price;

    public Product() {

    }

    public Product(String tv, int i, int price) {
        this.id = i;
        this.name = tv;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
