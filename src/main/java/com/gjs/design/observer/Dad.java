package com.gjs.design.observer;

public class Dad extends BaseObserver {

    @Override
    public void action(Event event) {
        System.out.println("Dad feeding");
    }
}
