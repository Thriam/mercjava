package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Laptop {
    private int id;
    private String name;
    private String brand;
    private double price;
    private String RAM;
}
