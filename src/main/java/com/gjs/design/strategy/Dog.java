package com.gjs.design.strategy;

public class Dog {

    int food;

    int compareTo(Dog d1, Dog d2) {
        return d1.food - d2.food;
    }
}
