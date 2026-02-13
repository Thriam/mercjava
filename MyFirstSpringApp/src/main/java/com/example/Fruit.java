package com.example;

public class Fruit {
    int id;
    int price;
    String name;

    public Fruit() {
    }

    public Fruit(int id, int price, String name) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
