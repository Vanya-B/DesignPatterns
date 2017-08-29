package com.babychev.designPatterns.strategy;

public class Main {
    public static void main(String[] args) {
        SportCar scar = new SportCar(new SlowEngine());
        scar.drive();
        System.out.println("change engine from slow to sport ...");
        scar.setEngine(new SportEngine());
        scar.drive();
    }
}
