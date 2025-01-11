package test.app;

public class Vehicle {
    public String name;

    public Vehicle(String name) {
        System.out.println("Vehicle constructor");
        this.name = name;
        System.out.println("Vehicle name: " + name);
    }
}
