package org.example;

public class Main {
    public static void main() {
        Car car = new Car();

        car.printStatus();

        System.out.println();

        car.accelerate();
        car.printStatus();

        System.out.println();

        car.accelerate(20);
        car.printStatus();

        System.out.println();

        car.accelerate(5, 4);
        car.printStatus();
    }
}
