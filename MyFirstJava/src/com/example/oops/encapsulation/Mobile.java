package com.example.oops.encapsulation;

public class Mobile {
    // Encapsulation: Bundling of Data and Code

    // Data
    private int id;
    private String brand;
    private int RAM;
    public int color;
    String hardDrive; // Only accessible within encapsulation package
    protected boolean explore;

    // Code
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        if (RAM <= 0) {
            System.out.println("RAM is invalid");
        }
        else {
            this.RAM = RAM;
        }
    }
}
