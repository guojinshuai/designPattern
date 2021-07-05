package com.gjs.design.strategy;

public class Cat implements Comparable<Cat> {

    int weight;

    Cat(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat cat) {
        return this.weight - cat.weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }
}
