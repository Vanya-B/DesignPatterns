package com.babychev.designPatterns.strategy;

public class SportEngine implements Engine{
    @Override
    public void doWork() {
        for (int i = 0; i < 10; i++) {
            System.out.println("drive like a rocket >>=====>");
        }
    }
}
