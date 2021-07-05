package com.gjs.design.observer;

public class Child extends BaseSubject {

    @Override
    public void notifyObservers() {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dog());
        observers.add(new BaseObserver() {
            @Override
            public void action(Event event) {
                System.out.println(event.position);
            }
        });
        Event event = new Event("床上", System.currentTimeMillis());
        observers.forEach(observer -> {
            observer.action(event);
        });
    }
}
