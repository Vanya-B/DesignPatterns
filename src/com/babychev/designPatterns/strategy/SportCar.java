package com.babychev.designPatterns.strategy;

public class SportCar implements Car{

    private Engine engine;

    public SportCar(Engine engine){
        this.engine = engine;
    }

    @Override
    public void drive() {
        engine.doWork();
    }

    @Override
    public void stop() {
        System.out.println("stop car");
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
