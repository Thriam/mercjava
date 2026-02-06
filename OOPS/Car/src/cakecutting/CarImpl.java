package cakecutting;

public class CarImpl implements ICar {
    @Override
    public void startEngine() {
        System.out.println("Engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
}
