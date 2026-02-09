package com.example.oops.inheritance.usecase;

public class Mug {
    public void addLiquid(Liquid liquid) {
//        System.out.println("Adding liquid to the Mug");
//        liquid.swirl();
        if (liquid instanceof Coffee)
            System.out.println("Coffee");
        else if (liquid instanceof Tea)
            System.out.println("Tea");
        else
            System.out.println("General Liquid");
    }
    public void addJuice(Juice juice) {
        juice.swirl();
    }

}
