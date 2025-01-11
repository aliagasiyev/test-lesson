package test.app;

public class Car {
    public String color;

    public Car(String color) {
       this. color = color;
    }

    public static void main(String[] args) {
        Car car = new Car("red");
        System.out.println(car.color);
    }

}
