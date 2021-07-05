package com.gjs.design.decorate;

/**
 * @author guojs
 * @create 2019/11/6
 */
public class Decorate extends Person {

    protected Person person;

    public void Decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
