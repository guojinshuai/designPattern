package com.gjs.design.composite;

public class LeafNode extends Node {

    private String name;

    public LeafNode(String name) {
        this.name = name;
    }

    @Override
    void printName() {
        System.out.println(name);
    }
}
