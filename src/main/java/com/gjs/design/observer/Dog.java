package com.gjs.design.observer;

public class Dog extends BaseObserver {
    @Override
    public void action(Event event) {
        System.out.println("Dog wang...");
    }
}
