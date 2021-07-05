package com.gjs.design.observer;

public class Mom extends BaseObserver {
    @Override
    public void action(Event event) {
        System.out.println("Mom hugging");
    }
}
