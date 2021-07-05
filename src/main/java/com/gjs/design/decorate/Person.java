package com.gjs.design.decorate;

/**
 * @author guojs
 * @create 2019/11/6
 */
public class Person {

    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name);
    }
}
