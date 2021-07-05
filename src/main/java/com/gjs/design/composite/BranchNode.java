package com.gjs.design.composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends Node {

    public List<Node> list = new ArrayList<>();

    private String name;

    public BranchNode(String name) {
        this.name = name;
    }

    public BranchNode add(Node node) {
        list.add(node);
        return this;
    }

    @Override
    void printName() {
        System.out.println(name);
    }
}
