package pizzacutting;

import java.util.ArrayList;
import java.util.List;
import cakecutting.ICar;

public class Car extends Vehicle implements ICar {
    private String color;
    private String model;
    private int chassisNo;
    private float price;
    private List<Wheel> wheels;

    public Car() {
        this.wheels = new ArrayList<>();
    }

    public Car(String color) {
        this();
        this.color = color;
    }

    public Car(String color, String model, int chassisNo, float price) {
        this(color);
        this.model = model;
        this.chassisNo = chassisNo;
        this.price = price;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
        super.move(); // Demonstrating inheritance
    }

    public void addWheel(Wheel wheel) {
        if (wheels.size() < 4) {
            wheels.add(wheel);
            System.out.println("Wheel added.");
        } else {
            System.out.println("Car already has 4 wheels.");
        }
    }

    public void removeWheel(Wheel wheel) {
        if (wheels.remove(wheel)) {
            System.out.println("Wheel removed.");
        } else {
            System.out.println("Wheel not found.");
        }
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Chassis No: " + chassisNo);
        System.out.println("Price: " + price);
        System.out.println("Wheels:");
        for (Wheel w : wheels) {
            w.displayWheel();
        }
    }

    public String getColor() {
        return this.color;
    }

    public String getModel() {
        return this.model;
    }

    public int getChassisNo() {
        return chassisNo;
    }

    public float getPrice() {
        return price;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }
}
