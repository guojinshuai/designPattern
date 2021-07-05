package com.gjs.design.observer;

public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        child.notifyObservers();
    }
}
