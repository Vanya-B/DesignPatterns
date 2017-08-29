package com.babychev.designPatterns.strategy;

public class SlowEngine implements Engine{
    @Override
    public void doWork() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Drive like a snail ...@");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
