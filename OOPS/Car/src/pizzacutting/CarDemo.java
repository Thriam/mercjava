package pizzacutting;
import cakecutting.ICar;
import cakecutting.CarImpl;

class CarDemo {
    public static void main(String[] args) {
        // Demonstrating class instantiation and inheritance (Car extends Vehicle)
        Car c = new Car("Red", "Sedan", 12345, 25000.0f);
        System.out.println("Car created.");

        // Demonstrating association (Car has Wheels)
        Wheel w1 = new Wheel(16, "Alloy");
        Wheel w2 = new Wheel(16, "Alloy");
        Wheel w3 = new Wheel(16, "Alloy");
        Wheel w4 = new Wheel(16, "Alloy");

        c.addWheel(w1);
        c.addWheel(w2);
        c.addWheel(w3);
        c.addWheel(w4);

        // Demonstrating interface implementation (Car implements ICar)
        c.startEngine();
        c.drive();
        c.displayDetails();
        c.stopEngine();

        // Demonstrating polymorphism with interface
        ICar carInterface = c; // Car is an ICar
        carInterface.startEngine();
        carInterface.drive();
        carInterface.stopEngine();

        // Demonstrating another implementation of ICar
        CarImpl carImpl = new CarImpl();
        carImpl.startEngine();
        carImpl.drive();
        carImpl.stopEngine();
    }
}
